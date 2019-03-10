package com.osvaldoga.cameldemo.transformation;

import com.osvaldoga.cameldemo.dto.BaseDatosRequest;
import com.osvaldoga.cameldemo.dto.TomcatResponse;

public class BaseDatosTransformacion {
    public BaseDatosRequest transformar(TomcatResponse tomcatResponse) {
        BaseDatosRequest req = new BaseDatosRequest();
        //req.setCodigo(tomcatResponse.getDocumento().getCodigoDocumento());

        System.out.println(tomcatResponse);

        return req;
    }

}
