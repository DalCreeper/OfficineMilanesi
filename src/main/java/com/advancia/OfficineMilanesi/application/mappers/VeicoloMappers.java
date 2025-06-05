package com.advancia.OfficineMilanesi.application.mappers;

import com.advancia.OfficineMilanesi.application.model.VeicoloDto;
import com.advancia.OfficineMilanesi.domain.model.Veicolo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface VeicoloMappers {
    VeicoloDto convertFromEntity(Veicolo veicolo);
    Veicolo convertToEntity(VeicoloDto veicoloDto);

    List<VeicoloDto> convertFromEntity(List<Veicolo> veicoli);
    List<Veicolo> convertToEntity(List<VeicoloDto> veicoliDto);
}