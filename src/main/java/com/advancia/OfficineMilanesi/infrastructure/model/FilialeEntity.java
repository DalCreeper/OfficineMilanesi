package com.advancia.OfficineMilanesi.infrastructure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "FILIALI")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilialeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "RAG_SOCIALE")
    private String ragSociale;

    @Column(name = "P_IVA")
    private String pIva;

    @Column(name = "COD_FISCALE", unique = true, nullable = false)
    private String codFiscale;

    @Column(name = "PEC")
    private String pec;

    @Column(name = "TELEFONO", unique = true)
    private String telefono;

    @Column(name = "INDIRIZZO")
    private String indirizzo;

    @Column(name = "CAP")
    private String cap;

    @Column(name = "PROVINCIA")
    private String provincia;

    @Column(name = "CITTA")
    private String citta;

    @Column(name = "NAZIONE")
    private String nazione;

    @Column(name = "NOME_OFFICINA")
    private String nomeOfficina;

    @Column(name = "DATA_INS")
    private LocalDate dataIns;

    @Column(name = "DATA_AGG")
    private LocalDate dataAgg;

    @OneToMany(mappedBy = "filialeEntity")
    private List<FatturaEntity> fatture;
}