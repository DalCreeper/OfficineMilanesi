package com.advancia.OfficineMilanesi.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.IdClass;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(FatturaArticoloIdDto.class)
public class FatturaArticoloDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private FatturaDto fatturaDto;
    private ArticoloDto articoloDto;
    private Integer quantita;
    private BigDecimal sconto;
}