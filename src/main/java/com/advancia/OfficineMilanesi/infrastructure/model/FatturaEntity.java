package com.advancia.OfficineMilanesi.infrastructure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@NamedStoredProcedureQuery(
    name = "Fattura.generaRandom",
    procedureName = "genera_fatture_random"
)
@Entity
@Table(name = "FATTURE", schema = "OFFMILANESI")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"articoli"})
public class FatturaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fattura_seq")
    @SequenceGenerator(name = "fattura_seq", sequenceName = "ID_FATTURA", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_FILIALE", nullable = false)
    private FilialeEntity filialeEntity;

    @Column(name = "PROTOCOLLO")
    private String protocollo;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE", nullable = false)
    private ClienteEntity clienteEntity;

    @Column(name = "TIPO_DOC")
    private String tipoDoc;

    @Column(name = "NUMERO_FATT")
    private String numeroFatt;

    @Column(name = "DATA_FATT")
    private LocalDate dataFatt;

    @Column(name = "N_PAGINE")
    private Integer nPagine;

    @Column(name = "CODICE_PAGINA")
    private Integer codicePagina;

    @Column(name = "MOD_PAGAMENTO")
    private String modPagamento;

    @Column(name = "CAUSALE")
    private String causale;

    @Column(name = "NOTA_DOC")
    private String notaDoc;

    @Column(name = "DATA_PREV_CONSEGNA")
    private LocalDate dataPrevConsegna;

    @Column(name = "BANCA_APPOGGIO")
    private String bancaAppoggio;

    @Column(name = "TOTALE")
    private BigDecimal totale;

    @ManyToOne
    @JoinColumn(name = "ID_MECCANICO", nullable = false)
    private MeccanicoEntity meccanicoEntity;

    @ManyToOne
    @JoinColumn(name = "ID_VEICOLO", nullable = false)
    private VeicoloEntity veicoloEntity;

    @OneToMany(mappedBy = "fatturaEntity", cascade = CascadeType.REMOVE)
    private List<FatturaArticoloEntity> articoli = new ArrayList<>();
}