package com.advancia.OfficineMilanesi.infrastructure.mappers;

import com.advancia.OfficineMilanesi.domain.model.Articolo;
import com.advancia.OfficineMilanesi.infrastructure.model.ArticoloEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ArticoloEntityMappers {
    Articolo convertFromEntity(ArticoloEntity articoloEntity);
    ArticoloEntity convertToEntity(Articolo articolo);

    List<Articolo> convertFromEntity(List<ArticoloEntity> articoliEntity);
    List<ArticoloEntity> convertToEntity(List<Articolo> articoli);
}