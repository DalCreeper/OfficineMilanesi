package com.advancia.OfficineMilanesi.application.mappers;

import com.advancia.OfficineMilanesi.domain.model.Articolo;
import org.mapstruct.Mapper;

@Mapper
public interface ArticoloMappers {
    ArticoloDto convertFromDomain(Articolo articolo);
    Articolo convertToDomain(ArticoloDto articoloDto);
}