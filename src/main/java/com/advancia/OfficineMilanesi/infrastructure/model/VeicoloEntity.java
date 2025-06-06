package com.advancia.OfficineMilanesi.infrastructure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "VEICOLI", schema = "OFFMILANESI")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"fatture"})
public class VeicoloEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "veicolo_seq")
    @SequenceGenerator(name = "veicolo_seq", sequenceName = "ID_VEICOLO", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "MODELLO_VETT")
    private String modelloVett;

    @Column(name = "TELAIO")
    private String telaio;

    @Column(name = "TARGA", nullable = false)
    private String targa;

    @Column(name = "MOTORE")
    private String motore;

    @Column(name = "CILINDRATA")
    private Integer cilindrata;

    @Column(name = "DATA_IMMATR")
    private LocalDate dataImmatr;

    @Column(name = "DATA_VENDITA")
    private LocalDate dataVendita;

    @Column(name = "STATO")
    private String stato;

    @Column(name = "KM_PERCORSI")
    private Integer kmPercorsi;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE", nullable = false)
    private ClienteEntity clienteEntity;

    @Column(name = "DATA_INS")
    private LocalDate dataIns;

    @Column(name = "DATA_AGG")
    private LocalDate dataAgg;

    @OneToMany(mappedBy = "veicoloEntity")
    private List<FatturaEntity> fatture;
}