package com.dio.ponto.service;

import com.dio.ponto.model.JornadaTrabalho;
import com.dio.ponto.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JornadaService {

    JornadaRepository jornadaRepository;
    //Padrao hoje em dia criar a injeção assim
    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }

    public JornadaTrabalho saveJornada(JornadaTrabalho j){
        return jornadaRepository.save(j);
    }



}
