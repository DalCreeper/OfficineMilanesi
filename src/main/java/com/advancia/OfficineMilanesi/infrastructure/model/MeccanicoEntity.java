package com.advancia.OfficineMilanesi.infrastructure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "MECCANICI", schema = "OFFMILANESI")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"fatture"})
public class MeccanicoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "meccanico_seq")
    @SequenceGenerator(name = "meccanico_seq", sequenceName = "ID_MECCANICO", allocationSize = 1)
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