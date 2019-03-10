package com.osvaldoga.cameldemo.dto;


public class DocumentoRequest {
    private Integer codigo;


    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "DocumentoRequest{" +
                "codigo=" + codigo +
                '}';
    }
}
