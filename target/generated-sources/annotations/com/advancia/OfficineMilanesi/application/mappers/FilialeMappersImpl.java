package com.advancia.OfficineMilanesi.application.mappers;

import com.advancia.OfficineMilanesi.application.model.FilialeDto;
import com.advancia.OfficineMilanesi.domain.model.Filiale;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-05T15:14:58+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 1.8.0_441 (Oracle Corporation)"
)
public class FilialeMappersImpl implements FilialeMappers {

    @Override
    public FilialeDto convertFromDomain(Filiale filiale) {
        if ( filiale == null ) {
            return null;
        }

        FilialeDto filialeDto = new FilialeDto();

        filialeDto.setId( filiale.getId() );
        filialeDto.setRagSociale( filiale.getRagSociale() );
        filialeDto.setPIva( filiale.getPIva() );
        filialeDto.setCodFiscale( filiale.getCodFiscale() );
        filialeDto.setPec( filiale.getPec() );
        filialeDto.setTelefono( filiale.getTelefono() );
        filialeDto.setIndirizzo( filiale.getIndirizzo() );
        filialeDto.setCap( filiale.getCap() );
        filialeDto.setProvincia( filiale.getProvincia() );
        filialeDto.setCitta( filiale.getCitta() );
        filialeDto.setNazione( filiale.getNazione() );
        filialeDto.setNomeOfficina( filiale.getNomeOfficina() );
        filialeDto.setDataIns( filiale.getDataIns() );
        filialeDto.setDataAgg( filiale.getDataAgg() );

        return filialeDto;
    }

    @Override
    public Filiale convertToDomain(FilialeDto filialeDto) {
        if ( filialeDto == null ) {
            return null;
        }

        Filiale filiale = new Filiale();

        filiale.setId( filialeDto.getId() );
        filiale.setRagSociale( filialeDto.getRagSociale() );
        filiale.setPIva( filialeDto.getPIva() );
        filiale.setCodFiscale( filialeDto.getCodFiscale() );
        filiale.setPec( filialeDto.getPec() );
        filiale.setTelefono( filialeDto.getTelefono() );
        filiale.setIndirizzo( filialeDto.getIndirizzo() );
        filiale.setCap( filialeDto.getCap() );
        filiale.setProvincia( filialeDto.getProvincia() );
        filiale.setCitta( filialeDto.getCitta() );
        filiale.setNazione( filialeDto.getNazione() );
        filiale.setNomeOfficina( filialeDto.getNomeOfficina() );
        filiale.setDataIns( filialeDto.getDataIns() );
        filiale.setDataAgg( filialeDto.getDataAgg() );

        return filiale;
    }

    @Override
    public List<FilialeDto> convertFromDomain(List<Filiale> filiali) {
        if ( filiali == null ) {
            return null;
        }

        List<FilialeDto> list = new ArrayList<FilialeDto>( filiali.size() );
        for ( Filiale filiale : filiali ) {
            list.add( convertFromDomain( filiale ) );
        }

        return list;
    }

    @Override
    public List<Filiale> convertToDomain(List<FilialeDto> filialiDto) {
        if ( filialiDto == null ) {
            return null;
        }

        List<Filiale> list = new ArrayList<Filiale>( filialiDto.size() );
        for ( FilialeDto filialeDto : filialiDto ) {
            list.add( convertToDomain( filialeDto ) );
        }

        return list;
    }
}
