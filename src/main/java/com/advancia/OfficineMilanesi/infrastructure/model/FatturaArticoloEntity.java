package com.advancia.OfficineMilanesi.infrastructure.model;

import com.advancia.OfficineMilanesi.domain.model.FatturaArticoloId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "FATTURE_ARTICOLI", schema = "OFFMILANESI")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FatturaArticoloEntity {
    @EmbeddedId
    private FatturaArticoloIdEntity id;

    @MapsId("idFattura")
    @ManyToOne
    @JoinColumn(name = "ID_FATTURA", nullable = false)
    private FatturaEntity fatturaEntity;

    @MapsId("idArticolo")
    @ManyToOne
    @JoinColumn(name = "ID_ARTICOLO", nullable = false)
    private ArticoloEntity articoloEntity;

    @Column(name = "QUANTITA")
    private Integer quantita;

    @Column(name = "SCONTO")
    private BigDecimal sconto;
}