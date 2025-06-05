package com.advancia.OfficineMilanesi.infrastructure.mappers;

import com.advancia.OfficineMilanesi.domain.model.Fattura;
import com.advancia.OfficineMilanesi.domain.model.FatturaArticolo;
import com.advancia.OfficineMilanesi.domain.model.FatturaArticoloId;
import com.advancia.OfficineMilanesi.infrastructure.model.FatturaArticoloEntity;
import com.advancia.OfficineMilanesi.infrastructure.model.FatturaArticoloIdEntity;
import com.advancia.OfficineMilanesi.infrastructure.model.FatturaEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface FatturaEntityMappers {
    Fattura convertFromEntity(FatturaEntity fatturaEntity);
    FatturaEntity convertToEntity(Fattura fattura);

    FatturaArticolo convertFromEntity(FatturaArticoloEntity fatturaArticoloEntity);
    FatturaArticoloEntity convertToEntity(FatturaArticolo fatturaArticolo);

    FatturaArticoloId convertFromEntity(FatturaArticoloIdEntity fatturaArticoloIdEntity);
    FatturaArticoloIdEntity convertToEntity(FatturaArticoloId fatturaArticoloId);

    List<Fattura> convertFromEntity(List<FatturaEntity> fattureEntity);
    List<FatturaEntity> convertToEntity(List<Fattura> fatture);
}