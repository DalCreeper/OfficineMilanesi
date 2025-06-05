package com.advancia.OfficineMilanesi.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FatturaDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private FilialeDto filialeDto;
    private String protocollo;
    private ClienteDto clienteDto;
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
    private MeccanicoDto meccanicoDto;
    private VeicoloDto veicoloDto;
    private List<FatturaArticoloDto> articoli = new ArrayList<>();
}