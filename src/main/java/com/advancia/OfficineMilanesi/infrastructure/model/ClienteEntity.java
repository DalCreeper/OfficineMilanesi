package com.advancia.OfficineMilanesi.infrastructure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "CLIENTI")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    private String ragSociale;

    private String p_iva;

    @Column(unique = true, nullable = false)
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