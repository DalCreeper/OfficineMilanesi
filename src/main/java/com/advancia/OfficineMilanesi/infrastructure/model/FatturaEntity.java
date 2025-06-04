package com.advancia.OfficineMilanesi.infrastructure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "FATTURE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FatturaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_filiale", nullable = false)
    private FilialeEntity filialeEntity;

    private String protocollo;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private ClienteEntity clienteEntity;

    private String tipoDoc;

    private String numeroFatt;

    private LocalDate dataFatt;

    private Integer nPagine;

    private Integer codicePagina;

    private String modPagamento;

    private String causale;

    private String notaDoc;

    private LocalDate dataPrevConsegna;

    private String bancaAppoggio;

    private BigDecimal totale;

    @ManyToOne
    @JoinColumn(name = "id_meccanico", nullable = false)
    private MeccanicoEntity meccanicoEntity;

    @ManyToOne
    @JoinColumn(name = "id_veicolo", nullable = false)
    private VeicoloEntity veicoloEntity;

    @OneToMany(mappedBy = "fattura", cascade = CascadeType.ALL)
    private List<FatturaArticoloEntity> articoli = new ArrayList<>();
}