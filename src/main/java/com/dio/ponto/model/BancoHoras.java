package com.dio.ponto.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class BancoHoras {

    @EqualsAndHashCode
    @Embeddable
    @Getter
    @Setter
    public class BancoHorasId implements Serializable {
        private Long idBancoHoras;
        private Long idMovimento;
        private Long idUsuario;
    }
    @EmbeddedId
    private BancoHorasId id;
    //ignorar a categoriausuario pois não faz sentido aqui, pois ela se liga com outros relacionamentos
    //private CategoriaUsuario categoriaUsuario;
    private LocalDateTime dataTrabalhada;
    private BigDecimal quantidadeHoras;
    private BigDecimal saldoHoras;
}
