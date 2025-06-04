package com.advancia.OfficineMilanesi.application.mappers;

import com.advancia.OfficineMilanesi.domain.model.Filiale;
import org.mapstruct.Mapper;

@Mapper
public interface FilialeMappers {
    FilialeDto convertFromDomain(Filiale filiale);
    Filiale convertToDomain(FilialeDto filialeDto);
}