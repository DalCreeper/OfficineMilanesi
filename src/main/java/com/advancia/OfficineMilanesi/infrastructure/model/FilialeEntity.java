package com.advancia.OfficineMilanesi.infrastructure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "FILIALI")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilialeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ragSociale;

    private String pIva;

    @Column(unique = true, nullable = false)
    private String codFiscale;

    private String pec;

    @Column(unique = true)
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