package com.advancia.OfficineMilanesi.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FatturaArticoloId implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long fattura;
    private Long articolo;
}