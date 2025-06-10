package com.advancia.OfficineMilanesi.application.mappers;

import com.advancia.OfficineMilanesi.application.model.FatturaArticoloDto;
import com.advancia.OfficineMilanesi.application.model.FatturaArticoloIdDto;
import com.advancia.OfficineMilanesi.application.model.FatturaDto;
import com.advancia.OfficineMilanesi.domain.model.Fattura;
import com.advancia.OfficineMilanesi.domain.model.FatturaArticolo;
import com.advancia.OfficineMilanesi.domain.model.FatturaArticoloId;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-10T17:24:31+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class FatturaMappersImpl implements FatturaMappers {

    @Override
    public FatturaDto convertFromDomain(Fattura fattura) {
        if ( fattura == null ) {
            return null;
        }

        FatturaDto fatturaDto = new FatturaDto();

        fatturaDto.setId( fattura.getId() );
        fatturaDto.setProtocollo( fattura.getProtocollo() );
        fatturaDto.setTipoDoc( fattura.getTipoDoc() );
        fatturaDto.setNumeroFatt( fattura.getNumeroFatt() );
        fatturaDto.setDataFatt( fattura.getDataFatt() );
        fatturaDto.setNPagine( fattura.getNPagine() );
        fatturaDto.setCodicePagina( fattura.getCodicePagina() );
        fatturaDto.setModPagamento( fattura.getModPagamento() );
        fatturaDto.setCausale( fattura.getCausale() );
        fatturaDto.setNotaDoc( fattura.getNotaDoc() );
        fatturaDto.setDataPrevConsegna( fattura.getDataPrevConsegna() );
        fatturaDto.setBancaAppoggio( fattura.getBancaAppoggio() );
        fatturaDto.setTotale( fattura.getTotale() );
        fatturaDto.setArticoli( fatturaArticoloListToFatturaArticoloDtoList( fattura.getArticoli() ) );

        return fatturaDto;
    }

    @Override
    public Fattura convertToDomain(FatturaDto fatturaDto) {
        if ( fatturaDto == null ) {
            return null;
        }

        Fattura fattura = new Fattura();

        fattura.setId( fatturaDto.getId() );
        fattura.setProtocollo( fatturaDto.getProtocollo() );
        fattura.setTipoDoc( fatturaDto.getTipoDoc() );
        fattura.setNumeroFatt( fatturaDto.getNumeroFatt() );
        fattura.setDataFatt( fatturaDto.getDataFatt() );
        fattura.setNPagine( fatturaDto.getNPagine() );
        fattura.setCodicePagina( fatturaDto.getCodicePagina() );
        fattura.setModPagamento( fatturaDto.getModPagamento() );
        fattura.setCausale( fatturaDto.getCausale() );
        fattura.setNotaDoc( fatturaDto.getNotaDoc() );
        fattura.setDataPrevConsegna( fatturaDto.getDataPrevConsegna() );
        fattura.setBancaAppoggio( fatturaDto.getBancaAppoggio() );
        fattura.setTotale( fatturaDto.getTotale() );
        fattura.setArticoli( fatturaArticoloDtoListToFatturaArticoloList( fatturaDto.getArticoli() ) );

        return fattura;
    }

    @Override
    public FatturaArticoloDto convertFromDomain(FatturaArticolo fatturaArticolo) {
        if ( fatturaArticolo == null ) {
            return null;
        }

        FatturaArticoloDto fatturaArticoloDto = new FatturaArticoloDto();

        fatturaArticoloDto.setQuantita( fatturaArticolo.getQuantita() );
        fatturaArticoloDto.setSconto( fatturaArticolo.getSconto() );

        return fatturaArticoloDto;
    }

    @Override
    public FatturaArticolo convertToDomain(FatturaArticoloDto fatturaArticoloDto) {
        if ( fatturaArticoloDto == null ) {
            return null;
        }

        FatturaArticolo fatturaArticolo = new FatturaArticolo();

        fatturaArticolo.setQuantita( fatturaArticoloDto.getQuantita() );
        fatturaArticolo.setSconto( fatturaArticoloDto.getSconto() );

        return fatturaArticolo;
    }

    @Override
    public FatturaArticoloIdDto convertFromDomain(FatturaArticoloId fatturaArticoloId) {
        if ( fatturaArticoloId == null ) {
            return null;
        }

        FatturaArticoloIdDto fatturaArticoloIdDto = new FatturaArticoloIdDto();

        fatturaArticoloIdDto.setFattura( fatturaArticoloId.getFattura() );
        fatturaArticoloIdDto.setArticolo( fatturaArticoloId.getArticolo() );

        return fatturaArticoloIdDto;
    }

    @Override
    public FatturaArticoloId convertToDomain(FatturaArticoloIdDto fatturaArticoloIdDto) {
        if ( fatturaArticoloIdDto == null ) {
            return null;
        }

        FatturaArticoloId fatturaArticoloId = new FatturaArticoloId();

        fatturaArticoloId.setFattura( fatturaArticoloIdDto.getFattura() );
        fatturaArticoloId.setArticolo( fatturaArticoloIdDto.getArticolo() );

        return fatturaArticoloId;
    }

    @Override
    public List<FatturaDto> convertFromDomain(List<Fattura> fatture) {
        if ( fatture == null ) {
            return null;
        }

        List<FatturaDto> list = new ArrayList<FatturaDto>( fatture.size() );
        for ( Fattura fattura : fatture ) {
            list.add( convertFromDomain( fattura ) );
        }

        return list;
    }

    @Override
    public List<Fattura> convertToDomain(List<FatturaDto> fattureDto) {
        if ( fattureDto == null ) {
            return null;
        }

        List<Fattura> list = new ArrayList<Fattura>( fattureDto.size() );
        for ( FatturaDto fatturaDto : fattureDto ) {
            list.add( convertToDomain( fatturaDto ) );
        }

        return list;
    }

    protected List<FatturaArticoloDto> fatturaArticoloListToFatturaArticoloDtoList(List<FatturaArticolo> list) {
        if ( list == null ) {
            return null;
        }

        List<FatturaArticoloDto> list1 = new ArrayList<FatturaArticoloDto>( list.size() );
        for ( FatturaArticolo fatturaArticolo : list ) {
            list1.add( convertFromDomain( fatturaArticolo ) );
        }

        return list1;
    }

    protected List<FatturaArticolo> fatturaArticoloDtoListToFatturaArticoloList(List<FatturaArticoloDto> list) {
        if ( list == null ) {
            return null;
        }

        List<FatturaArticolo> list1 = new ArrayList<FatturaArticolo>( list.size() );
        for ( FatturaArticoloDto fatturaArticoloDto : list ) {
            list1.add( convertToDomain( fatturaArticoloDto ) );
        }

        return list1;
    }
}
