package org.example.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClienteController {

    @RequestMapping(
            value = {"/api/clientes/hello/{nome}"},
            method = RequestMethod.POST,
            consumes = {"application/json", "application/xml"},
            produces = {"application/json", "application/xml"}
    )
    public String helloCliente (@PathVariable("nome") String nomeCliente) {
        return String.format("Hello %s", nomeCliente);
    }

}
