package com.osvaldoga.cameldemo.dto;

import java.util.Date;

public class Documento {
    private Integer codigoDocumento;
    private Date fecha;
    private String empresa;

    public Integer getCodigoDocumento() {
        return codigoDocumento;
    }

    public void setCodigoDocumento(Integer codigoDocumento) {
        this.codigoDocumento = codigoDocumento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }


    @Override
    public String toString() {
        return "Documento{" +
                "codigoDocumento=" + codigoDocumento +
                ", fecha=" + fecha +
                ", empresa='" + empresa + '\'' +
                '}';
    }
}
