package com.advancia.OfficineMilanesi.application.mappers;

import com.advancia.OfficineMilanesi.application.model.ArticoloDto;
import com.advancia.OfficineMilanesi.domain.model.Articolo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-10T17:24:31+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class ArticoloMappersImpl implements ArticoloMappers {

    @Override
    public ArticoloDto convertFromDomain(Articolo articolo) {
        if ( articolo == null ) {
            return null;
        }

        ArticoloDto articoloDto = new ArticoloDto();

        articoloDto.setId( articolo.getId() );
        articoloDto.setPosMagazzino( articolo.getPosMagazzino() );
        articoloDto.setSf( articolo.getSf() );
        articoloDto.setCodArticolo( articolo.getCodArticolo() );
        articoloDto.setDescrizione( articolo.getDescrizione() );
        articoloDto.setPrezzoUnit( articolo.getPrezzoUnit() );
        articoloDto.setDataIns( articolo.getDataIns() );
        articoloDto.setDataAgg( articolo.getDataAgg() );

        return articoloDto;
    }

    @Override
    public Articolo convertToDomain(ArticoloDto articoloDto) {
        if ( articoloDto == null ) {
            return null;
        }

        Articolo articolo = new Articolo();

        articolo.setId( articoloDto.getId() );
        articolo.setPosMagazzino( articoloDto.getPosMagazzino() );
        articolo.setSf( articoloDto.getSf() );
        articolo.setCodArticolo( articoloDto.getCodArticolo() );
        articolo.setDescrizione( articoloDto.getDescrizione() );
        articolo.setPrezzoUnit( articoloDto.getPrezzoUnit() );
        articolo.setDataIns( articoloDto.getDataIns() );
        articolo.setDataAgg( articoloDto.getDataAgg() );

        return articolo;
    }

    @Override
    public List<ArticoloDto> convertFromDomain(List<Articolo> articoli) {
        if ( articoli == null ) {
            return null;
        }

        List<ArticoloDto> list = new ArrayList<ArticoloDto>( articoli.size() );
        for ( Articolo articolo : articoli ) {
            list.add( convertFromDomain( articolo ) );
        }

        return list;
    }

    @Override
    public List<Articolo> convertToDomain(List<ArticoloDto> articoliDto) {
        if ( articoliDto == null ) {
            return null;
        }

        List<Articolo> list = new ArrayList<Articolo>( articoliDto.size() );
        for ( ArticoloDto articoloDto : articoliDto ) {
            list.add( convertToDomain( articoloDto ) );
        }

        return list;
    }
}
