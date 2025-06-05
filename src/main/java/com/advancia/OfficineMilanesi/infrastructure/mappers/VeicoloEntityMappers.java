package com.advancia.OfficineMilanesi.infrastructure.mappers;

import com.advancia.OfficineMilanesi.domain.model.Veicolo;
import com.advancia.OfficineMilanesi.infrastructure.model.VeicoloEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface VeicoloEntityMappers {
    Veicolo convertFromEntity(VeicoloEntity veicoloEntity);
    VeicoloEntity convertToEntity(Veicolo veicolo);

    List<Veicolo> convertFromEntity(List<VeicoloEntity> veicoliEntity);
    List<VeicoloEntity> convertToEntity(List<Veicolo> veicoli);
}