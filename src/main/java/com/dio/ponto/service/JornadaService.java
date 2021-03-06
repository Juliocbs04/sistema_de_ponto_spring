package com.dio.ponto.service;

import com.dio.ponto.model.JornadaTrabalho;
import com.dio.ponto.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    JornadaRepository jornadaRepository;
    //Padrao hoje em dia criar a injeção assim
    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {
        return jornadaRepository.findAll();
    }

    public Optional<JornadaTrabalho> findById(Long idJornada) {
        return jornadaRepository.findById(idJornada);
    }

    public void deleteJornada(Long idJornada) {
        jornadaRepository.deleteById(idJornada);
    }

}
