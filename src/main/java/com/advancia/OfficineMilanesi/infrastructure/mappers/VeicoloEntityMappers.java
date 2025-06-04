package com.advancia.OfficineMilanesi.infrastructure.mappers;

import com.advancia.OfficineMilanesi.domain.model.Veicolo;
import com.advancia.OfficineMilanesi.infrastructure.model.VeicoloEntity;
import org.mapstruct.Mapper;

@Mapper
public interface VeicoloEntityMappers {
    Veicolo convertFromEntity(VeicoloEntity veicoloEntity);
    VeicoloEntity convertToEntity(Veicolo veicolo);
}