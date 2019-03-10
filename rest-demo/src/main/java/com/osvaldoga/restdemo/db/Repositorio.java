package com.osvaldoga.restdemo.db;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.*;

@Component
public class Repositorio {
    private Map<Integer, Documento> documentos;

    @PostConstruct
    public void init() {
        documentos = new HashMap<>();


        Documento documento = null;

        for (int i = 1; i < 10; i++) {
            documento = new Documento();
            documento.setCodigo(i);
            documento.setNombre("Documento_" + i);
            documento.setFechaCreacion(new Date());
            documento.setEmpresa("Axity");

            documentos.put(i, documento);
        }
    }

    public Documento getDocumento(Integer codigo) {
        return documentos.get(codigo);
    }
}
