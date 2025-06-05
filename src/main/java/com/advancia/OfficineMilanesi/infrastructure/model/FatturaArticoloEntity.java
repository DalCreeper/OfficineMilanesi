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
    @JoinColumn(name = "ID_FATTURA", nullable = false)
    private FatturaEntity fatturaEntity;

    @Id
    @ManyToOne
    @JoinColumn(name = "ID_ARTICOLO", nullable = false)
    private ArticoloEntity articoloEntity;

    @Column(name = "QUANTITA")
    private Integer quantita;

    @Column(name = "SCONTO")
    private BigDecimal sconto;
}