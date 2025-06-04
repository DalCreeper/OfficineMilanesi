package com.advancia.OfficineMilanesi.application.mappers;

import com.advancia.OfficineMilanesi.domain.model.Meccanico;
import org.mapstruct.Mapper;

@Mapper
public interface MeccanicoMappers {
    MeccanicoDto convertFromDomain(Meccanico meccanico);
    Meccanico convertToDomain(MeccanicoDto meccanicoDto);
}