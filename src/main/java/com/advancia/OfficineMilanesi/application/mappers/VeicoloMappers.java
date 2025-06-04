package com.advancia.OfficineMilanesi.application.mappers;

import com.advancia.OfficineMilanesi.domain.model.Veicolo;
import org.mapstruct.Mapper;

@Mapper
public interface VeicoloMappers {
    VeicoloDto convertFromEntity(Veicolo veicolo);
    Veicolo convertToEntity(VeicoloDto veicoloDto);
}