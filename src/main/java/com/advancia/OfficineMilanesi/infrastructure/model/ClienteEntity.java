package com.advancia.OfficineMilanesi.infrastructure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "CLIENTI", schema = "OFFMILANESI")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"fatture", "veicoli"})
public class ClienteEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_seq")
    @SequenceGenerator(name = "cliente_seq", sequenceName = "ID_CLIENTE", allocationSize = 1)
    @Column(name = "ID")
    private long id;

    @Column(name = "RAG_SOCIALE")
    private String ragSociale;

    @Column(name = "P_IVA")
    private String pIva;

    @Column(name = "COD_FISCALE", unique = true, nullable = false)
    private String codFiscale;

    @Column(name = "PEC")
    private String pec;

    @Column(name = "TELEFONO")
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

    @Column(name = "DATA_INS")
    private LocalDate dataIns;

    @Column(name = "DATA_AGG")
    private LocalDate dataAgg;

    @OneToMany(mappedBy = "clienteEntity")
    private List<FatturaEntity> fatture;

    @OneToMany(mappedBy = "clienteEntity")
    private List<VeicoloEntity> veicoli;
}