package com.advancia.OfficineMilanesi.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Filiale implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
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
    private String nomeOfficina;
    private LocalDate dataIns;
    private LocalDate dataAgg;
}