package com.advancia.OfficineMilanesi.infrastructure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "ARTICOLI")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticoloEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String posMagazzino;

    private String sf;

    @Column(unique = true, nullable = false)
    private String codArticolo;

    private String descrizione;

    @Column(nullable = false)
    private BigDecimal prezzoUnit;

    private LocalDate dataIns;

    private LocalDate dataAgg;
}