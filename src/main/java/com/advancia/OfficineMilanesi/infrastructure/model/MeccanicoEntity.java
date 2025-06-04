package com.advancia.OfficineMilanesi.infrastructure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "MECCANICI")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MeccanicoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cognome;

    @Column(unique = true, nullable = false)
    private String codFiscale;

    private String telefono;

    private LocalDate dataIns;

    private LocalDate dataAgg;
}