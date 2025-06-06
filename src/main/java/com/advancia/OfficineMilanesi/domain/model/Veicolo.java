package com.advancia.OfficineMilanesi.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Veicolo {
    private Long id;
    private String modelloVett;
    private String telaio;
    private String targa;
    private String motore;
    private Integer cilindrata;
    private LocalDate dataImmatr;
    private LocalDate dataVendita;
    private String stato;
    private Integer kmPercorsi;
    private Cliente cliente;
    private LocalDate dataIns;
    private LocalDate dataAgg;
}