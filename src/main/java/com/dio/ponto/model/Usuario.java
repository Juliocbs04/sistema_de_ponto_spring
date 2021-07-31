package com.dio.ponto.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Usuario {
    private Long id;
    private CategoriaUsuario categoriaUsuario;
    private String nome;

    private Empresa empresa;

    private NivelAcesso nivelAcesso;

    private JornadaTrabalho jornadaTrabalho;

    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime fimJornada;
}
