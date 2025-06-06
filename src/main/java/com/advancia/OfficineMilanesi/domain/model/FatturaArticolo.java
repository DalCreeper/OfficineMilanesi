package com.advancia.OfficineMilanesi.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(FatturaArticoloId.class)
public class FatturaArticolo {
    private Fattura fattura;
    private Articolo articolo;
    private Integer quantita;
    private BigDecimal sconto;
}