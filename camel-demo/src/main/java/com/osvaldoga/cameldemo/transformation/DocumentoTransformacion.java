package com.osvaldoga.cameldemo.transformation;

import com.osvaldoga.cameldemo.dto.TomcatRequest;
import org.apache.camel.Header;
import org.springframework.stereotype.Component;

@Component
public class DocumentoTransformacion {
    public TomcatRequest transformar(@Header("id")String id) {
        TomcatRequest tomcatRequest = new TomcatRequest();
        tomcatRequest.setCodigo(Integer.valueOf(id));

        return tomcatRequest;
    }

}
