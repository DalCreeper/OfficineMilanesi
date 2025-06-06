package com.advancia.OfficineMilanesi.infrastructure.mappers;

import com.advancia.OfficineMilanesi.domain.model.Fattura;
import com.advancia.OfficineMilanesi.domain.model.FatturaArticolo;
import com.advancia.OfficineMilanesi.domain.model.FatturaArticoloId;
import com.advancia.OfficineMilanesi.infrastructure.model.FatturaArticoloEntity;
import com.advancia.OfficineMilanesi.infrastructure.model.FatturaArticoloIdEntity;
import com.advancia.OfficineMilanesi.infrastructure.model.FatturaEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-06T23:22:15+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class FatturaEntityMappersImpl implements FatturaEntityMappers {

    @Override
    public Fattura convertFromEntity(FatturaEntity fatturaEntity) {
        if ( fatturaEntity == null ) {
            return null;
        }

        Fattura fattura = new Fattura();

        fattura.setId( fatturaEntity.getId() );
        fattura.setProtocollo( fatturaEntity.getProtocollo() );
        fattura.setTipoDoc( fatturaEntity.getTipoDoc() );
        fattura.setNumeroFatt( fatturaEntity.getNumeroFatt() );
        fattura.setDataFatt( fatturaEntity.getDataFatt() );
        fattura.setNPagine( fatturaEntity.getNPagine() );
        fattura.setCodicePagina( fatturaEntity.getCodicePagina() );
        fattura.setModPagamento( fatturaEntity.getModPagamento() );
        fattura.setCausale( fatturaEntity.getCausale() );
        fattura.setNotaDoc( fatturaEntity.getNotaDoc() );
        fattura.setDataPrevConsegna( fatturaEntity.getDataPrevConsegna() );
        fattura.setBancaAppoggio( fatturaEntity.getBancaAppoggio() );
        fattura.setTotale( fatturaEntity.getTotale() );
        fattura.setArticoli( fatturaArticoloEntityListToFatturaArticoloList( fatturaEntity.getArticoli() ) );

        return fattura;
    }

    @Override
    public FatturaEntity convertToEntity(Fattura fattura) {
        if ( fattura == null ) {
            return null;
        }

        FatturaEntity fatturaEntity = new FatturaEntity();

        fatturaEntity.setId( fattura.getId() );
        fatturaEntity.setProtocollo( fattura.getProtocollo() );
        fatturaEntity.setTipoDoc( fattura.getTipoDoc() );
        fatturaEntity.setNumeroFatt( fattura.getNumeroFatt() );
        fatturaEntity.setDataFatt( fattura.getDataFatt() );
        fatturaEntity.setNPagine( fattura.getNPagine() );
        fatturaEntity.setCodicePagina( fattura.getCodicePagina() );
        fatturaEntity.setModPagamento( fattura.getModPagamento() );
        fatturaEntity.setCausale( fattura.getCausale() );
        fatturaEntity.setNotaDoc( fattura.getNotaDoc() );
        fatturaEntity.setDataPrevConsegna( fattura.getDataPrevConsegna() );
        fatturaEntity.setBancaAppoggio( fattura.getBancaAppoggio() );
        fatturaEntity.setTotale( fattura.getTotale() );
        fatturaEntity.setArticoli( fatturaArticoloListToFatturaArticoloEntityList( fattura.getArticoli() ) );

        return fatturaEntity;
    }

    @Override
    public FatturaArticolo convertFromEntity(FatturaArticoloEntity fatturaArticoloEntity) {
        if ( fatturaArticoloEntity == null ) {
            return null;
        }

        FatturaArticolo fatturaArticolo = new FatturaArticolo();

        fatturaArticolo.setQuantita( fatturaArticoloEntity.getQuantita() );
        fatturaArticolo.setSconto( fatturaArticoloEntity.getSconto() );

        return fatturaArticolo;
    }

    @Override
    public FatturaArticoloEntity convertToEntity(FatturaArticolo fatturaArticolo) {
        if ( fatturaArticolo == null ) {
            return null;
        }

        FatturaArticoloEntity fatturaArticoloEntity = new FatturaArticoloEntity();

        fatturaArticoloEntity.setQuantita( fatturaArticolo.getQuantita() );
        fatturaArticoloEntity.setSconto( fatturaArticolo.getSconto() );

        return fatturaArticoloEntity;
    }

    @Override
    public FatturaArticoloId convertFromEntity(FatturaArticoloIdEntity fatturaArticoloIdEntity) {
        if ( fatturaArticoloIdEntity == null ) {
            return null;
        }

        FatturaArticoloId fatturaArticoloId = new FatturaArticoloId();

        return fatturaArticoloId;
    }

    @Override
    public FatturaArticoloIdEntity convertToEntity(FatturaArticoloId fatturaArticoloId) {
        if ( fatturaArticoloId == null ) {
            return null;
        }

        FatturaArticoloIdEntity fatturaArticoloIdEntity = new FatturaArticoloIdEntity();

        return fatturaArticoloIdEntity;
    }

    @Override
    public List<Fattura> convertFromEntity(List<FatturaEntity> fattureEntity) {
        if ( fattureEntity == null ) {
            return null;
        }

        List<Fattura> list = new ArrayList<Fattura>( fattureEntity.size() );
        for ( FatturaEntity fatturaEntity : fattureEntity ) {
            list.add( convertFromEntity( fatturaEntity ) );
        }

        return list;
    }

    @Override
    public List<FatturaEntity> convertToEntity(List<Fattura> fatture) {
        if ( fatture == null ) {
            return null;
        }

        List<FatturaEntity> list = new ArrayList<FatturaEntity>( fatture.size() );
        for ( Fattura fattura : fatture ) {
            list.add( convertToEntity( fattura ) );
        }

        return list;
    }

    protected List<FatturaArticolo> fatturaArticoloEntityListToFatturaArticoloList(List<FatturaArticoloEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<FatturaArticolo> list1 = new ArrayList<FatturaArticolo>( list.size() );
        for ( FatturaArticoloEntity fatturaArticoloEntity : list ) {
            list1.add( convertFromEntity( fatturaArticoloEntity ) );
        }

        return list1;
    }

    protected List<FatturaArticoloEntity> fatturaArticoloListToFatturaArticoloEntityList(List<FatturaArticolo> list) {
        if ( list == null ) {
            return null;
        }

        List<FatturaArticoloEntity> list1 = new ArrayList<FatturaArticoloEntity>( list.size() );
        for ( FatturaArticolo fatturaArticolo : list ) {
            list1.add( convertToEntity( fatturaArticolo ) );
        }

        return list1;
    }
}
