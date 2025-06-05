package com.advancia.OfficineMilanesi.application.mappers;

import com.advancia.OfficineMilanesi.application.model.FilialeDto;
import com.advancia.OfficineMilanesi.domain.model.Filiale;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface FilialeMappers {
    FilialeDto convertFromDomain(Filiale filiale);
    Filiale convertToDomain(FilialeDto filialeDto);

    List<FilialeDto> convertFromDomain(List<Filiale> filiali);
    List<Filiale> convertToDomain(List<FilialeDto> filialiDto);
}