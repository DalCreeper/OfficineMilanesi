package com.advancia.OfficineMilanesi.infrastructure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "VEICOLI")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VeicoloEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelloVett;

    private String telaio;

    @Column(nullable = false)
    private String targa;

    private String motore;

    private Integer cilindrata;

    private LocalDate dataImmatr;

    private LocalDate dataVendita;

    private String stato;

    private Integer kmPercorsi;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private ClienteEntity clienteEntity;

    private LocalDate dataIns;

    private LocalDate dataAgg;
}