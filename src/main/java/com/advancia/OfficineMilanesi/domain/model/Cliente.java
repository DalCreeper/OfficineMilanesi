package com.advancia.OfficineMilanesi.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    private long id;
    private String ragSociale;
    private String pIva;
    private String codFiscale;
    private String pec;
    private String telefono;
    private String indirizzo;
    private String cap;
    private String provincia;
    private String citta;
    private String nazione;
    private LocalDate dataIns;
    private LocalDate dataAgg;
}