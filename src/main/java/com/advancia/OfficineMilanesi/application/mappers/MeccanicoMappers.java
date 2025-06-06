package com.advancia.OfficineMilanesi.application.mappers;

import com.advancia.OfficineMilanesi.application.model.MeccanicoDto;
import com.advancia.OfficineMilanesi.domain.model.Meccanico;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface MeccanicoMappers {
    MeccanicoDto convertFromDomain(Meccanico meccanico);
    Meccanico convertToDomain(MeccanicoDto meccanicoDto);

    List<MeccanicoDto> convertFromDomain(List<Meccanico> meccanici);
    List<Meccanico> convertToDomain(List<MeccanicoDto> meccaniciDto);
}