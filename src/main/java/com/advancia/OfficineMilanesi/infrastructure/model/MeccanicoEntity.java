package com.advancia.OfficineMilanesi.infrastructure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "MECCANICI")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MeccanicoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "COGNOME")
    private String cognome;

    @Column(name = "COD_FISCALE", unique = true, nullable = false)
    private String codFiscale;

    @Column(name = "TELEFONO")
    private String telefono;

    @Column(name = "DATA_INS")
    private LocalDate dataIns;

    @Column(name = "DATA_AGG")
    private LocalDate dataAgg;

    @OneToMany(mappedBy = "meccanicoEntity")
    private List<FatturaEntity> fatture;
}