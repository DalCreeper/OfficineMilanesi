package com.advancia.OfficineMilanesi.infrastructure.mappers;

import com.advancia.OfficineMilanesi.domain.model.Filiale;
import com.advancia.OfficineMilanesi.infrastructure.model.FilialeEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface FilialeEntityMappers {
    Filiale convertFromEntity(FilialeEntity filialeEntity);
    FilialeEntity convertToEntity(Filiale filiale);

    List<Filiale> convertFromEntity(List<FilialeEntity> filialiEntity);
    List<FilialeEntity> convertToEntity(List<Filiale> filiali);
}