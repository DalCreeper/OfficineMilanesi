package com.advancia.OfficineMilanesi.infrastructure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "ARTICOLI")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticoloEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "POS_MAGAZZINO")
    private String posMagazzino;

    @Column(name = "SF")
    private String sf;

    @Column(name = "COD_ARTICOLO", unique = true, nullable = false)
    private String codArticolo;

    @Column(name = "DESCRIZIONE")
    private String descrizione;

    @Column(name = "PREZZO_UNIT", nullable = false)
    private BigDecimal prezzoUnit;

    @Column(name = "DATA_INS")
    private LocalDate dataIns;

    @Column(name = "DATA_AGG")
    private LocalDate dataAgg;

    @OneToMany(mappedBy = "articoloEntity")
    private List<FatturaArticoloEntity> fattureArticolo;
}