package com.advancia.OfficineMilanesi.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Articolo {
    private Long id;
    private String posMagazzino;
    private String sf;
    private String codArticolo;
    private String descrizione;
    private BigDecimal prezzoUnit;
    private LocalDate dataIns;
    private LocalDate dataAgg;
}