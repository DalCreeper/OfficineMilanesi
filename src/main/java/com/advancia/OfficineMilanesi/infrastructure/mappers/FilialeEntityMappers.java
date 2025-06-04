package com.advancia.OfficineMilanesi.infrastructure.mappers;

import com.advancia.OfficineMilanesi.domain.model.Filiale;
import com.advancia.OfficineMilanesi.infrastructure.model.FilialeEntity;
import org.mapstruct.Mapper;

@Mapper
public interface FilialeEntityMappers {
    Filiale convertFromEntity(FilialeEntity filialeEntity);
    FilialeEntity convertToEntity(Filiale filiale);
}