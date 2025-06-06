package com.advancia.OfficineMilanesi.application.mappers;

import com.advancia.OfficineMilanesi.application.model.MeccanicoDto;
import com.advancia.OfficineMilanesi.domain.model.Meccanico;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-06T23:22:15+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class MeccanicoMappersImpl implements MeccanicoMappers {

    @Override
    public MeccanicoDto convertFromDomain(Meccanico meccanico) {
        if ( meccanico == null ) {
            return null;
        }

        MeccanicoDto meccanicoDto = new MeccanicoDto();

        meccanicoDto.setId( meccanico.getId() );
        meccanicoDto.setNome( meccanico.getNome() );
        meccanicoDto.setCognome( meccanico.getCognome() );
        meccanicoDto.setCodFiscale( meccanico.getCodFiscale() );
        meccanicoDto.setTelefono( meccanico.getTelefono() );
        meccanicoDto.setDataIns( meccanico.getDataIns() );
        meccanicoDto.setDataAgg( meccanico.getDataAgg() );

        return meccanicoDto;
    }

    @Override
    public Meccanico convertToDomain(MeccanicoDto meccanicoDto) {
        if ( meccanicoDto == null ) {
            return null;
        }

        Meccanico meccanico = new Meccanico();

        meccanico.setId( meccanicoDto.getId() );
        meccanico.setNome( meccanicoDto.getNome() );
        meccanico.setCognome( meccanicoDto.getCognome() );
        meccanico.setCodFiscale( meccanicoDto.getCodFiscale() );
        meccanico.setTelefono( meccanicoDto.getTelefono() );
        meccanico.setDataIns( meccanicoDto.getDataIns() );
        meccanico.setDataAgg( meccanicoDto.getDataAgg() );

        return meccanico;
    }

    @Override
    public List<MeccanicoDto> convertFromDomain(List<Meccanico> meccanici) {
        if ( meccanici == null ) {
            return null;
        }

        List<MeccanicoDto> list = new ArrayList<MeccanicoDto>( meccanici.size() );
        for ( Meccanico meccanico : meccanici ) {
            list.add( convertFromDomain( meccanico ) );
        }

        return list;
    }

    @Override
    public List<Meccanico> convertToDomain(List<MeccanicoDto> meccaniciDto) {
        if ( meccaniciDto == null ) {
            return null;
        }

        List<Meccanico> list = new ArrayList<Meccanico>( meccaniciDto.size() );
        for ( MeccanicoDto meccanicoDto : meccaniciDto ) {
            list.add( convertToDomain( meccanicoDto ) );
        }

        return list;
    }
}
