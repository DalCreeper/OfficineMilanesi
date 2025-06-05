package com.advancia.OfficineMilanesi.application.mappers;

import com.advancia.OfficineMilanesi.application.model.VeicoloDto;
import com.advancia.OfficineMilanesi.domain.model.Veicolo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface VeicoloMappers {
    VeicoloDto convertFromDomain(Veicolo veicolo);
    Veicolo convertToDomain(VeicoloDto veicoloDto);

    List<VeicoloDto> convertFromDomain(List<Veicolo> veicoli);
    List<Veicolo> convertToDomain(List<VeicoloDto> veicoliDto);
}