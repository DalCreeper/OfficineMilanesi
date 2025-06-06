package com.advancia.OfficineMilanesi.infrastructure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class FatturaArticoloIdEntity implements Serializable {

    @Column(name = "ID_FATTURA")
    private Long idFattura;

    @Column(name = "ID_ARTICOLO")
    private Long idArticolo;
}