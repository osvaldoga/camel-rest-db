package com.osvaldoga.restdemo;

import com.osvaldoga.restdemo.db.Documento;
import com.osvaldoga.restdemo.db.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class DemoController {
    @Autowired
    private Repositorio respoRepositorio;


    @RequestMapping("/documento/{id}")
    public Documento getDocumento(@PathVariable(value="id") Integer codigo) {
        try {
            Documento documento = respoRepositorio.getDocumento(codigo);

            if (documento == null) {
                throw new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Documento Not Found");
            }
            System.out.println(documento);
            return documento;
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "No existe documento con codigo ["+ codigo +"]");
        }
    }
}
