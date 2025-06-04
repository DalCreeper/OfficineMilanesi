package com.advancia.OfficineMilanesi.infrastructure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "FATTURE_ARTICOLI")
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(FatturaArticoloIdEntity.class)
public class FatturaArticoloEntity {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_fattura", nullable = false)
    private FatturaEntity fatturaEntity;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_articolo", nullable = false)
    private ArticoloEntity articoloEntity;

    private Integer quantita;

    private BigDecimal sconto;
}