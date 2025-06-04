package com.advancia.OfficineMilanesi.application.mappers;

import com.advancia.OfficineMilanesi.domain.model.Fattura;
import com.advancia.OfficineMilanesi.domain.model.FatturaArticolo;
import com.advancia.OfficineMilanesi.domain.model.FatturaArticoloId;
import org.mapstruct.Mapper;

@Mapper
public interface FatturaMappers {
    FatturaDto convertFromDomain(Fattura fattura);
    Fattura convertToDomain(FatturaDto fatturaDto);

    FatturaArticoloDto convertFromDomain(FatturaArticolo fatturaArticolo);
    FatturaArticolo convertToDomain(FatturaArticoloDto fatturaArticoloDto);

    FatturaArticoloIdDto convertFromDomain(FatturaArticoloId fatturaArticoloId);
    FatturaArticoloId convertToDomain(FatturaArticoloIdDto fatturaArticoloIdDto);
}