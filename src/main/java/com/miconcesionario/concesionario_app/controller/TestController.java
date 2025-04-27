package com.miconcesionario.concesionario_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/test")
    public String helloWorld() {
        return "¡Servidor funcionando!";
    }
}
