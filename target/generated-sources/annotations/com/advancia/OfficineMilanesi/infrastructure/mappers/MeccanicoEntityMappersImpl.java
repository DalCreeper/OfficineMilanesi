package com.advancia.OfficineMilanesi.infrastructure.mappers;

import com.advancia.OfficineMilanesi.domain.model.Meccanico;
import com.advancia.OfficineMilanesi.infrastructure.model.MeccanicoEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-05T15:14:58+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 1.8.0_441 (Oracle Corporation)"
)
public class MeccanicoEntityMappersImpl implements MeccanicoEntityMappers {

    @Override
    public Meccanico convertFromEntity(MeccanicoEntity meccanicoEntity) {
        if ( meccanicoEntity == null ) {
            return null;
        }

        Meccanico meccanico = new Meccanico();

        meccanico.setId( meccanicoEntity.getId() );
        meccanico.setNome( meccanicoEntity.getNome() );
        meccanico.setCognome( meccanicoEntity.getCognome() );
        meccanico.setCodFiscale( meccanicoEntity.getCodFiscale() );
        meccanico.setTelefono( meccanicoEntity.getTelefono() );
        meccanico.setDataIns( meccanicoEntity.getDataIns() );
        meccanico.setDataAgg( meccanicoEntity.getDataAgg() );

        return meccanico;
    }

    @Override
    public MeccanicoEntity convertToEntity(Meccanico meccanico) {
        if ( meccanico == null ) {
            return null;
        }

        MeccanicoEntity meccanicoEntity = new MeccanicoEntity();

        meccanicoEntity.setId( meccanico.getId() );
        meccanicoEntity.setNome( meccanico.getNome() );
        meccanicoEntity.setCognome( meccanico.getCognome() );
        meccanicoEntity.setCodFiscale( meccanico.getCodFiscale() );
        meccanicoEntity.setTelefono( meccanico.getTelefono() );
        meccanicoEntity.setDataIns( meccanico.getDataIns() );
        meccanicoEntity.setDataAgg( meccanico.getDataAgg() );

        return meccanicoEntity;
    }

    @Override
    public List<Meccanico> convertFromEntity(List<MeccanicoEntity> meccaniciEntity) {
        if ( meccaniciEntity == null ) {
            return null;
        }

        List<Meccanico> list = new ArrayList<Meccanico>( meccaniciEntity.size() );
        for ( MeccanicoEntity meccanicoEntity : meccaniciEntity ) {
            list.add( convertFromEntity( meccanicoEntity ) );
        }

        return list;
    }

    @Override
    public List<MeccanicoEntity> convertToEntity(List<Meccanico> meccanico) {
        if ( meccanico == null ) {
            return null;
        }

        List<MeccanicoEntity> list = new ArrayList<MeccanicoEntity>( meccanico.size() );
        for ( Meccanico meccanico1 : meccanico ) {
            list.add( convertToEntity( meccanico1 ) );
        }

        return list;
    }
}
