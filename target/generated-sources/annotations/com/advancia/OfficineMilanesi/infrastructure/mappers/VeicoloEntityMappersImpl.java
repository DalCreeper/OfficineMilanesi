package com.advancia.OfficineMilanesi.infrastructure.mappers;

import com.advancia.OfficineMilanesi.domain.model.Veicolo;
import com.advancia.OfficineMilanesi.infrastructure.model.VeicoloEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-05T15:14:58+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 1.8.0_441 (Oracle Corporation)"
)
public class VeicoloEntityMappersImpl implements VeicoloEntityMappers {

    @Override
    public Veicolo convertFromEntity(VeicoloEntity veicoloEntity) {
        if ( veicoloEntity == null ) {
            return null;
        }

        Veicolo veicolo = new Veicolo();

        veicolo.setId( veicoloEntity.getId() );
        veicolo.setModelloVett( veicoloEntity.getModelloVett() );
        veicolo.setTelaio( veicoloEntity.getTelaio() );
        veicolo.setTarga( veicoloEntity.getTarga() );
        veicolo.setMotore( veicoloEntity.getMotore() );
        veicolo.setCilindrata( veicoloEntity.getCilindrata() );
        veicolo.setDataImmatr( veicoloEntity.getDataImmatr() );
        veicolo.setDataVendita( veicoloEntity.getDataVendita() );
        veicolo.setStato( veicoloEntity.getStato() );
        veicolo.setKmPercorsi( veicoloEntity.getKmPercorsi() );
        veicolo.setDataIns( veicoloEntity.getDataIns() );
        veicolo.setDataAgg( veicoloEntity.getDataAgg() );

        return veicolo;
    }

    @Override
    public VeicoloEntity convertToEntity(Veicolo veicolo) {
        if ( veicolo == null ) {
            return null;
        }

        VeicoloEntity veicoloEntity = new VeicoloEntity();

        veicoloEntity.setId( veicolo.getId() );
        veicoloEntity.setModelloVett( veicolo.getModelloVett() );
        veicoloEntity.setTelaio( veicolo.getTelaio() );
        veicoloEntity.setTarga( veicolo.getTarga() );
        veicoloEntity.setMotore( veicolo.getMotore() );
        veicoloEntity.setCilindrata( veicolo.getCilindrata() );
        veicoloEntity.setDataImmatr( veicolo.getDataImmatr() );
        veicoloEntity.setDataVendita( veicolo.getDataVendita() );
        veicoloEntity.setStato( veicolo.getStato() );
        veicoloEntity.setKmPercorsi( veicolo.getKmPercorsi() );
        veicoloEntity.setDataIns( veicolo.getDataIns() );
        veicoloEntity.setDataAgg( veicolo.getDataAgg() );

        return veicoloEntity;
    }

    @Override
    public List<Veicolo> convertFromEntity(List<VeicoloEntity> veicoliEntity) {
        if ( veicoliEntity == null ) {
            return null;
        }

        List<Veicolo> list = new ArrayList<Veicolo>( veicoliEntity.size() );
        for ( VeicoloEntity veicoloEntity : veicoliEntity ) {
            list.add( convertFromEntity( veicoloEntity ) );
        }

        return list;
    }

    @Override
    public List<VeicoloEntity> convertToEntity(List<Veicolo> veicoli) {
        if ( veicoli == null ) {
            return null;
        }

        List<VeicoloEntity> list = new ArrayList<VeicoloEntity>( veicoli.size() );
        for ( Veicolo veicolo : veicoli ) {
            list.add( convertToEntity( veicolo ) );
        }

        return list;
    }
}
