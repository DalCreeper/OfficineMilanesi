package com.advancia.OfficineMilanesi.infrastructure.mappers;

import com.advancia.OfficineMilanesi.domain.model.Articolo;
import com.advancia.OfficineMilanesi.infrastructure.model.ArticoloEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ArticoloEntityMappers {
    Articolo convertFromEntity(ArticoloEntity articoloEntity);
    ArticoloEntity convertToEntity(Articolo articolo);
}