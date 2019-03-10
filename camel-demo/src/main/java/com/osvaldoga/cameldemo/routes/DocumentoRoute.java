package com.osvaldoga.cameldemo.routes;

import com.osvaldoga.cameldemo.dto.TomcatResponse;
import com.osvaldoga.cameldemo.transformation.BaseDatosResponseTransformation;
import com.osvaldoga.cameldemo.transformation.DocumentoResultadoTransformacion;
import com.osvaldoga.cameldemo.transformation.TomcatToDBTransformacion;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.http.common.HttpOperationFailedException;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class DocumentoRoute extends RouteBuilder {

    private String pathDocumento = "/documento";
    private String rutaDocumento = "direct:documento";
    private String rutaTomcat = "direct:tomcat";
    private String rutaDB = "direct:db";

    @Override
    public void configure() throws Exception {
        inicializarRest();

        rest(pathDocumento)
                .id("rest-documento")
                .get("/{id}")
                .to(rutaDocumento);

        from(rutaDocumento)
                .id("route-documento")
                .to(rutaTomcat)
                .setHeader("tomcatResponse", simple("${body}"))
                .bean(TomcatToDBTransformacion.class)
                .to(rutaDB)
                .setHeader("dbResponse", simple("${body}"))
                .bean(DocumentoResultadoTransformacion.class, "transformar(${header.tomcatResponse}, ${header.dbResponse})");


        from(rutaTomcat)
                .id("route-tomcat")
                .onException(HttpOperationFailedException.class)
                .handled(true)
                .setBody(simple("No existe el documento con codigo ${header.id} en el servidor remoto tomcat"))
                .end()
                .removeHeader(Exchange.HTTP_PATH)
                .toD("http4://127.0.0.1:8888/repo/documento/${header.id}?bridgeEndpoint=true")
                .unmarshal().json(JsonLibrary.Jackson, TomcatResponse.class);


        from(rutaDB)
                .id("route-db")
                .toD("sql:select * from detalle_documento where id_documento=${header.id}?outputType=StreamList&outputClass=com.osvaldoga.cameldemo.db.DetalleDocumento")
                .bean(BaseDatosResponseTransformation.class);

    }

    private void inicializarRest() {
        restConfiguration()
                .component("servlet")
                .bindingMode(RestBindingMode.json)
                .dataFormatProperty("prettyPrint", "true")
                .enableCORS(true)
                .contextPath("/api")
                .apiContextPath("/api-doc")
                .apiProperty("api.title", "API de Documento")
                .apiProperty("api.version", "1.0");
    }
}
