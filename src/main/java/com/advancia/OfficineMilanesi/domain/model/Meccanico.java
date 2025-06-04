package com.advancia.OfficineMilanesi.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Meccanico implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;
    private String cognome;
    private String codFiscale;
    private String telefono;
    private LocalDate dataIns;
    private LocalDate dataAgg;
}