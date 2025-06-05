package com.advancia.OfficineMilanesi.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FatturaArticoloIdDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long fattura;
    private Long articolo;
}