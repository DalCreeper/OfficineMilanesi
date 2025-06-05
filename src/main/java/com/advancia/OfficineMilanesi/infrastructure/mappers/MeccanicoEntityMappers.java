package com.advancia.OfficineMilanesi.infrastructure.mappers;

import com.advancia.OfficineMilanesi.domain.model.Meccanico;
import com.advancia.OfficineMilanesi.infrastructure.model.MeccanicoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface MeccanicoEntityMappers {
    Meccanico convertFromEntity(MeccanicoEntity meccanicoEntity);
    MeccanicoEntity convertToEntity(Meccanico meccanico);

    List<Meccanico> convertFromEntity(List<MeccanicoEntity> meccaniciEntity);
    List<MeccanicoEntity> convertToEntity(List<Meccanico> meccanico);
}