package com.advancia.OfficineMilanesi.infrastructure.mappers;

import com.advancia.OfficineMilanesi.domain.model.Filiale;
import com.advancia.OfficineMilanesi.infrastructure.model.FilialeEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-10T17:24:31+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class FilialeEntityMappersImpl implements FilialeEntityMappers {

    @Override
    public Filiale convertFromEntity(FilialeEntity filialeEntity) {
        if ( filialeEntity == null ) {
            return null;
        }

        Filiale filiale = new Filiale();

        filiale.setId( filialeEntity.getId() );
        filiale.setRagSociale( filialeEntity.getRagSociale() );
        filiale.setPIva( filialeEntity.getPIva() );
        filiale.setCodFiscale( filialeEntity.getCodFiscale() );
        filiale.setPec( filialeEntity.getPec() );
        filiale.setTelefono( filialeEntity.getTelefono() );
        filiale.setIndirizzo( filialeEntity.getIndirizzo() );
        filiale.setCap( filialeEntity.getCap() );
        filiale.setProvincia( filialeEntity.getProvincia() );
        filiale.setCitta( filialeEntity.getCitta() );
        filiale.setNazione( filialeEntity.getNazione() );
        filiale.setNomeOfficina( filialeEntity.getNomeOfficina() );
        filiale.setDataIns( filialeEntity.getDataIns() );
        filiale.setDataAgg( filialeEntity.getDataAgg() );

        return filiale;
    }

    @Override
    public FilialeEntity convertToEntity(Filiale filiale) {
        if ( filiale == null ) {
            return null;
        }

        FilialeEntity filialeEntity = new FilialeEntity();

        filialeEntity.setId( filiale.getId() );
        filialeEntity.setRagSociale( filiale.getRagSociale() );
        filialeEntity.setPIva( filiale.getPIva() );
        filialeEntity.setCodFiscale( filiale.getCodFiscale() );
        filialeEntity.setPec( filiale.getPec() );
        filialeEntity.setTelefono( filiale.getTelefono() );
        filialeEntity.setIndirizzo( filiale.getIndirizzo() );
        filialeEntity.setCap( filiale.getCap() );
        filialeEntity.setProvincia( filiale.getProvincia() );
        filialeEntity.setCitta( filiale.getCitta() );
        filialeEntity.setNazione( filiale.getNazione() );
        filialeEntity.setNomeOfficina( filiale.getNomeOfficina() );
        filialeEntity.setDataIns( filiale.getDataIns() );
        filialeEntity.setDataAgg( filiale.getDataAgg() );

        return filialeEntity;
    }

    @Override
    public List<Filiale> convertFromEntity(List<FilialeEntity> filialiEntity) {
        if ( filialiEntity == null ) {
            return null;
        }

        List<Filiale> list = new ArrayList<Filiale>( filialiEntity.size() );
        for ( FilialeEntity filialeEntity : filialiEntity ) {
            list.add( convertFromEntity( filialeEntity ) );
        }

        return list;
    }

    @Override
    public List<FilialeEntity> convertToEntity(List<Filiale> filiali) {
        if ( filiali == null ) {
            return null;
        }

        List<FilialeEntity> list = new ArrayList<FilialeEntity>( filiali.size() );
        for ( Filiale filiale : filiali ) {
            list.add( convertToEntity( filiale ) );
        }

        return list;
    }
}
