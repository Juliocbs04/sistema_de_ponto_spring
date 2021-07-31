package com.dio.ponto.model;

import lombok.*;

import javax.persistence.OneToMany;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Localidade {
    private Long id;
    @OneToMany
    private NivelAcesso nivelAcesso;
    private String descricao;
}
