package com.advancia.OfficineMilanesi.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VeicoloDto implements Serializable {
    private static final long serialVersionUID = 1L;

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
    private ClienteDto clienteDto;
    private LocalDate dataIns;
    private LocalDate dataAgg;
}