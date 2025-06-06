package com.advancia.OfficineMilanesi.infrastructure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "ARTICOLI", schema = "OFFMILANESI")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"fatture"})
public class ArticoloEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "articolo_seq")
    @SequenceGenerator(name = "articolo_seq", sequenceName = "ID_ARTICOLO", allocationSize = 1)
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
    private List<FatturaArticoloEntity> fatture;
}