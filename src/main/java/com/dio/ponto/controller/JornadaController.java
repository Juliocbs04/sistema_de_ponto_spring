package com.dio.ponto.controller;

import com.dio.ponto.model.JornadaTrabalho;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jornada")
public class JornadaController {
    JornadaTrabalho jornadaTrabalho;

    @PostMapping
    public JornadaTrabalho createJornada(){
        return null;
    }
}
