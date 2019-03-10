package com.osvaldoga.cameldemo.transformation;

import com.osvaldoga.cameldemo.dto.BaseDatosRequest;
import com.osvaldoga.cameldemo.dto.TomcatResponse;

public class TomcatToDBTransformacion {
    public BaseDatosRequest transformar(TomcatResponse tomcatResponse) {
        System.out.println(tomcatResponse);

        BaseDatosRequest req = new BaseDatosRequest();
        req.setCodigo(tomcatResponse.getCodigo());
        return req;
    }
}
