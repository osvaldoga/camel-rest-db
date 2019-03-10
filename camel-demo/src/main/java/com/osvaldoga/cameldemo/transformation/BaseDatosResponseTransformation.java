package com.osvaldoga.cameldemo.transformation;

import com.osvaldoga.cameldemo.db.DetalleDocumento;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class BaseDatosResponseTransformation {

    public List<DetalleDocumento> transformar(org.apache.camel.component.sql.ResultSetIterator iterador) {
        System.out.println(iterador);

        List<DetalleDocumento> detalles = new LinkedList<>();

        DetalleDocumento detalleDocumento = null;
        while (iterador.hasNext()) {
            detalleDocumento = (DetalleDocumento) iterador.next();
            System.out.println(detalleDocumento);
            detalles.add(detalleDocumento);
        }

        return detalles;
    }
}
