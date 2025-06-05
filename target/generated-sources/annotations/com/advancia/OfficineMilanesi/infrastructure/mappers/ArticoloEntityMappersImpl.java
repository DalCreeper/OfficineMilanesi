package com.advancia.OfficineMilanesi.infrastructure.mappers;

import com.advancia.OfficineMilanesi.domain.model.Articolo;
import com.advancia.OfficineMilanesi.infrastructure.model.ArticoloEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-05T15:14:58+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 1.8.0_441 (Oracle Corporation)"
)
public class ArticoloEntityMappersImpl implements ArticoloEntityMappers {

    @Override
    public Articolo convertFromEntity(ArticoloEntity articoloEntity) {
        if ( articoloEntity == null ) {
            return null;
        }

        Articolo articolo = new Articolo();

        articolo.setId( articoloEntity.getId() );
        articolo.setPosMagazzino( articoloEntity.getPosMagazzino() );
        articolo.setSf( articoloEntity.getSf() );
        articolo.setCodArticolo( articoloEntity.getCodArticolo() );
        articolo.setDescrizione( articoloEntity.getDescrizione() );
        articolo.setPrezzoUnit( articoloEntity.getPrezzoUnit() );
        articolo.setDataIns( articoloEntity.getDataIns() );
        articolo.setDataAgg( articoloEntity.getDataAgg() );

        return articolo;
    }

    @Override
    public ArticoloEntity convertToEntity(Articolo articolo) {
        if ( articolo == null ) {
            return null;
        }

        ArticoloEntity articoloEntity = new ArticoloEntity();

        articoloEntity.setId( articolo.getId() );
        articoloEntity.setPosMagazzino( articolo.getPosMagazzino() );
        articoloEntity.setSf( articolo.getSf() );
        articoloEntity.setCodArticolo( articolo.getCodArticolo() );
        articoloEntity.setDescrizione( articolo.getDescrizione() );
        articoloEntity.setPrezzoUnit( articolo.getPrezzoUnit() );
        articoloEntity.setDataIns( articolo.getDataIns() );
        articoloEntity.setDataAgg( articolo.getDataAgg() );

        return articoloEntity;
    }

    @Override
    public List<Articolo> convertFromEntity(List<ArticoloEntity> articoliEntity) {
        if ( articoliEntity == null ) {
            return null;
        }

        List<Articolo> list = new ArrayList<Articolo>( articoliEntity.size() );
        for ( ArticoloEntity articoloEntity : articoliEntity ) {
            list.add( convertFromEntity( articoloEntity ) );
        }

        return list;
    }

    @Override
    public List<ArticoloEntity> convertToEntity(List<Articolo> articoli) {
        if ( articoli == null ) {
            return null;
        }

        List<ArticoloEntity> list = new ArrayList<ArticoloEntity>( articoli.size() );
        for ( Articolo articolo : articoli ) {
            list.add( convertToEntity( articolo ) );
        }

        return list;
    }
}
