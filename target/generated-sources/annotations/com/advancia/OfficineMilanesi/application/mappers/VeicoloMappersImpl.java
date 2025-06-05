package com.advancia.OfficineMilanesi.application.mappers;

import com.advancia.OfficineMilanesi.application.model.VeicoloDto;
import com.advancia.OfficineMilanesi.domain.model.Veicolo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-05T15:14:58+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 1.8.0_441 (Oracle Corporation)"
)
public class VeicoloMappersImpl implements VeicoloMappers {

    @Override
    public VeicoloDto convertFromDomain(Veicolo veicolo) {
        if ( veicolo == null ) {
            return null;
        }

        VeicoloDto veicoloDto = new VeicoloDto();

        veicoloDto.setId( veicolo.getId() );
        veicoloDto.setModelloVett( veicolo.getModelloVett() );
        veicoloDto.setTelaio( veicolo.getTelaio() );
        veicoloDto.setTarga( veicolo.getTarga() );
        veicoloDto.setMotore( veicolo.getMotore() );
        veicoloDto.setCilindrata( veicolo.getCilindrata() );
        veicoloDto.setDataImmatr( veicolo.getDataImmatr() );
        veicoloDto.setDataVendita( veicolo.getDataVendita() );
        veicoloDto.setStato( veicolo.getStato() );
        veicoloDto.setKmPercorsi( veicolo.getKmPercorsi() );
        veicoloDto.setDataIns( veicolo.getDataIns() );
        veicoloDto.setDataAgg( veicolo.getDataAgg() );

        return veicoloDto;
    }

    @Override
    public Veicolo convertToDomain(VeicoloDto veicoloDto) {
        if ( veicoloDto == null ) {
            return null;
        }

        Veicolo veicolo = new Veicolo();

        veicolo.setId( veicoloDto.getId() );
        veicolo.setModelloVett( veicoloDto.getModelloVett() );
        veicolo.setTelaio( veicoloDto.getTelaio() );
        veicolo.setTarga( veicoloDto.getTarga() );
        veicolo.setMotore( veicoloDto.getMotore() );
        veicolo.setCilindrata( veicoloDto.getCilindrata() );
        veicolo.setDataImmatr( veicoloDto.getDataImmatr() );
        veicolo.setDataVendita( veicoloDto.getDataVendita() );
        veicolo.setStato( veicoloDto.getStato() );
        veicolo.setKmPercorsi( veicoloDto.getKmPercorsi() );
        veicolo.setDataIns( veicoloDto.getDataIns() );
        veicolo.setDataAgg( veicoloDto.getDataAgg() );

        return veicolo;
    }

    @Override
    public List<VeicoloDto> convertFromDomain(List<Veicolo> veicoli) {
        if ( veicoli == null ) {
            return null;
        }

        List<VeicoloDto> list = new ArrayList<VeicoloDto>( veicoli.size() );
        for ( Veicolo veicolo : veicoli ) {
            list.add( convertFromDomain( veicolo ) );
        }

        return list;
    }

    @Override
    public List<Veicolo> convertToDomain(List<VeicoloDto> veicoliDto) {
        if ( veicoliDto == null ) {
            return null;
        }

        List<Veicolo> list = new ArrayList<Veicolo>( veicoliDto.size() );
        for ( VeicoloDto veicoloDto : veicoliDto ) {
            list.add( convertToDomain( veicoloDto ) );
        }

        return list;
    }
}
