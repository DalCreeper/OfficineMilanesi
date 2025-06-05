package com.advancia.OfficineMilanesi.application.mappers;

import com.advancia.OfficineMilanesi.application.model.FatturaArticoloDto;
import com.advancia.OfficineMilanesi.application.model.FatturaArticoloIdDto;
import com.advancia.OfficineMilanesi.application.model.FatturaDto;
import com.advancia.OfficineMilanesi.domain.model.Fattura;
import com.advancia.OfficineMilanesi.domain.model.FatturaArticolo;
import com.advancia.OfficineMilanesi.domain.model.FatturaArticoloId;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface FatturaMappers {
    FatturaDto convertFromDomain(Fattura fattura);
    Fattura convertToDomain(FatturaDto fatturaDto);

    FatturaArticoloDto convertFromDomain(FatturaArticolo fatturaArticolo);
    FatturaArticolo convertToDomain(FatturaArticoloDto fatturaArticoloDto);

    FatturaArticoloIdDto convertFromDomain(FatturaArticoloId fatturaArticoloId);
    FatturaArticoloId convertToDomain(FatturaArticoloIdDto fatturaArticoloIdDto);

    List<FatturaDto> convertFromDomain(List<Fattura> fatture);
    List<Fattura> convertToDomain(List<FatturaDto> fattureDto);
}