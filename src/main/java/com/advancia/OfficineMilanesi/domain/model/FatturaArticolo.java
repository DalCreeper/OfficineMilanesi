package com.advancia.OfficineMilanesi.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(FatturaArticoloId.class)
public class FatturaArticolo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Fattura fattura;
    private Articolo articolo;
    private Integer quantita;
    private BigDecimal sconto;
}