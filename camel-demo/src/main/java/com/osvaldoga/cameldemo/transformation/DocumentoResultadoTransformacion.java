package com.osvaldoga.cameldemo.transformation;

import com.osvaldoga.cameldemo.db.DetalleDocumento;
import com.osvaldoga.cameldemo.dto.Detalle;
import com.osvaldoga.cameldemo.dto.Documento;
import com.osvaldoga.cameldemo.dto.DocumentoResponse;
import com.osvaldoga.cameldemo.dto.TomcatResponse;

import java.util.LinkedList;
import java.util.List;

public class DocumentoResultadoTransformacion {

    public DocumentoResponse transformar(TomcatResponse tomcatResponse, List<DetalleDocumento> detalles) {
        System.out.println("tomcatResponse => " + tomcatResponse);
        System.out.println("Detalle => " + detalles);

        Documento documento = new Documento();
        documento.setFecha(tomcatResponse.getFechaCreacion());
        documento.setCodigoDocumento(tomcatResponse.getCodigo());
        documento.setEmpresa(tomcatResponse.getEmpresa());

        Detalle detalle = null;
        List<Detalle> listado = new LinkedList<>();


        for (DetalleDocumento d : detalles) {
            detalle = new Detalle();
            detalle.setCodigo(d.getId());
            detalle.setNombre(d.getNombre());
            detalle.setValor(d.getValor());
            listado.add(detalle);
        }

        DocumentoResponse respuesta = new DocumentoResponse();
        respuesta.setEncabezado(documento);
        respuesta.setDetalles(listado);

        return respuesta;
    }
}
