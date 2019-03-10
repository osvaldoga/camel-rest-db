package com.osvaldoga.cameldemo.dto;

public class Detalle {
    private Integer codigo;
    private String nombre;
    private Integer valor;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Detalle{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", valor='" + valor + '\'' +
                '}';
    }
}
