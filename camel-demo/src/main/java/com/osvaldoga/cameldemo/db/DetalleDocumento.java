package com.osvaldoga.cameldemo.db;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DetalleDocumento {
    @Id
    private Integer id;
    private String nombre;
    private Integer valor;
    private Integer id_documento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getId_documento() {
        return id_documento;
    }

    public void setId_documento(Integer id_documento) {
        this.id_documento = id_documento;
    }

    public DetalleDocumento(String nombre, Integer valor, Integer id_documento) {
        this.nombre = nombre;
        this.valor = valor;
        this.id_documento = id_documento;
    }

    public DetalleDocumento() {
    }

    @Override
    public String toString() {
        return "Detalle{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", valor=" + valor +
                ", id_documento=" + id_documento +
                '}';
    }
}
