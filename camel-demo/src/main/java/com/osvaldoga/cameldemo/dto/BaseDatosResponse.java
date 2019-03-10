package com.osvaldoga.cameldemo.dto;

import java.util.List;

public class BaseDatosResponse {
    List<Detalle> detalle;

    public List<Detalle> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<Detalle> detalle) {
        this.detalle = detalle;
    }
}
