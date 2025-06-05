package com.advancia.OfficineMilanesi.application.mappers;

import com.advancia.OfficineMilanesi.application.model.ArticoloDto;
import com.advancia.OfficineMilanesi.domain.model.Articolo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ArticoloMappers {
    ArticoloDto convertFromDomain(Articolo articolo);
    Articolo convertToDomain(ArticoloDto articoloDto);

    List<ArticoloDto> convertFromEntity(List<Articolo> articoli);
    List<Articolo> convertToEntity(List<ArticoloDto> articoliDto);
}