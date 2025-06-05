package com.advancia.OfficineMilanesi.application.mappers;

import com.advancia.OfficineMilanesi.application.model.ClienteDto;
import com.advancia.OfficineMilanesi.domain.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-05T15:14:58+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 1.8.0_441 (Oracle Corporation)"
)
public class ClienteMappersImpl implements ClienteMappers {

    @Override
    public ClienteDto convertFromDomain(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        ClienteDto clienteDto = new ClienteDto();

        clienteDto.setId( cliente.getId() );
        clienteDto.setRagSociale( cliente.getRagSociale() );
        clienteDto.setP_iva( cliente.getP_iva() );
        clienteDto.setCodFiscale( cliente.getCodFiscale() );
        clienteDto.setPec( cliente.getPec() );
        clienteDto.setTelefono( cliente.getTelefono() );
        clienteDto.setIndirizzo( cliente.getIndirizzo() );
        clienteDto.setCap( cliente.getCap() );
        clienteDto.setProvincia( cliente.getProvincia() );
        clienteDto.setCitta( cliente.getCitta() );
        clienteDto.setNazione( cliente.getNazione() );
        clienteDto.setDataIns( cliente.getDataIns() );
        clienteDto.setDataAgg( cliente.getDataAgg() );

        return clienteDto;
    }

    @Override
    public Cliente convertToDomain(ClienteDto clienteDto) {
        if ( clienteDto == null ) {
            return null;
        }

        Cliente cliente = new Cliente();

        cliente.setId( clienteDto.getId() );
        cliente.setRagSociale( clienteDto.getRagSociale() );
        cliente.setP_iva( clienteDto.getP_iva() );
        cliente.setCodFiscale( clienteDto.getCodFiscale() );
        cliente.setPec( clienteDto.getPec() );
        cliente.setTelefono( clienteDto.getTelefono() );
        cliente.setIndirizzo( clienteDto.getIndirizzo() );
        cliente.setCap( clienteDto.getCap() );
        cliente.setProvincia( clienteDto.getProvincia() );
        cliente.setCitta( clienteDto.getCitta() );
        cliente.setNazione( clienteDto.getNazione() );
        cliente.setDataIns( clienteDto.getDataIns() );
        cliente.setDataAgg( clienteDto.getDataAgg() );

        return cliente;
    }

    @Override
    public List<ClienteDto> convertFromDomain(List<Cliente> clienti) {
        if ( clienti == null ) {
            return null;
        }

        List<ClienteDto> list = new ArrayList<ClienteDto>( clienti.size() );
        for ( Cliente cliente : clienti ) {
            list.add( convertFromDomain( cliente ) );
        }

        return list;
    }

    @Override
    public List<Cliente> convertToDomain(List<ClienteDto> clientiDto) {
        if ( clientiDto == null ) {
            return null;
        }

        List<Cliente> list = new ArrayList<Cliente>( clientiDto.size() );
        for ( ClienteDto clienteDto : clientiDto ) {
            list.add( convertToDomain( clienteDto ) );
        }

        return list;
    }
}
