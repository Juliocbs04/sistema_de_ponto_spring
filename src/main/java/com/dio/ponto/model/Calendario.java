package com.dio.ponto.model;

import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Calendario {
    private Long id;
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;

}
