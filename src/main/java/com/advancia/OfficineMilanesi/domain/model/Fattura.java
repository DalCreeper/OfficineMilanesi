package com.advancia.OfficineMilanesi.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fattura implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Filiale filiale;
    private String protocollo;
    private Cliente cliente;
    private String tipoDoc;
    private String numeroFatt;
    private LocalDate dataFatt;
    private Integer nPagine;
    private Integer codicePagina;
    private String modPagamento;
    private String causale;
    private String notaDoc;
    private LocalDate dataPrevConsegna;
    private String bancaAppoggio;
    private BigDecimal totale;
    private Meccanico meccanico;
    private Veicolo veicolo;
    private List<FatturaArticolo> articoli = new ArrayList<>();
}