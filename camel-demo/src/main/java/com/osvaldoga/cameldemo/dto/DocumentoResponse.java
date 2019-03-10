package com.osvaldoga.cameldemo.dto;

import java.util.List;

public class DocumentoResponse {

    private Documento encabezado;
    private List<Detalle> detalles;


    public Documento getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(Documento encabezado) {
        this.encabezado = encabezado;
    }

    public List<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Detalle> detalles) {
        this.detalles = detalles;
    }
}
