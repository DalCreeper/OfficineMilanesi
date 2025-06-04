package com.advancia.OfficineMilanesi.infrastructure.mappers;

import com.advancia.OfficineMilanesi.domain.model.Meccanico;
import com.advancia.OfficineMilanesi.infrastructure.model.MeccanicoEntity;
import org.mapstruct.Mapper;

@Mapper
public interface MeccanicoEntityMappers {
    Meccanico convertFromEntity(MeccanicoEntity meccanicoEntity);
    MeccanicoEntity convertToEntity(Meccanico meccanico);
}