package com.advancia.OfficineMilanesi.infrastructure.mappers;

import com.advancia.OfficineMilanesi.domain.model.Cliente;
import com.advancia.OfficineMilanesi.infrastructure.model.ClienteEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-05T15:14:58+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 1.8.0_441 (Oracle Corporation)"
)
public class ClienteEntityMappersImpl implements ClienteEntityMappers {

    @Override
    public Cliente convertFromEntity(ClienteEntity clienteEntity) {
        if ( clienteEntity == null ) {
            return null;
        }

        Cliente cliente = new Cliente();

        cliente.setId( clienteEntity.getId() );
        cliente.setRagSociale( clienteEntity.getRagSociale() );
        cliente.setP_iva( clienteEntity.getP_iva() );
        cliente.setCodFiscale( clienteEntity.getCodFiscale() );
        cliente.setPec( clienteEntity.getPec() );
        cliente.setTelefono( clienteEntity.getTelefono() );
        cliente.setIndirizzo( clienteEntity.getIndirizzo() );
        cliente.setCap( clienteEntity.getCap() );
        cliente.setProvincia( clienteEntity.getProvincia() );
        cliente.setCitta( clienteEntity.getCitta() );
        cliente.setNazione( clienteEntity.getNazione() );
        cliente.setDataIns( clienteEntity.getDataIns() );
        cliente.setDataAgg( clienteEntity.getDataAgg() );

        return cliente;
    }

    @Override
    public ClienteEntity convertToEntity(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        ClienteEntity clienteEntity = new ClienteEntity();

        clienteEntity.setId( cliente.getId() );
        clienteEntity.setRagSociale( cliente.getRagSociale() );
        clienteEntity.setP_iva( cliente.getP_iva() );
        clienteEntity.setCodFiscale( cliente.getCodFiscale() );
        clienteEntity.setPec( cliente.getPec() );
        clienteEntity.setTelefono( cliente.getTelefono() );
        clienteEntity.setIndirizzo( cliente.getIndirizzo() );
        clienteEntity.setCap( cliente.getCap() );
        clienteEntity.setProvincia( cliente.getProvincia() );
        clienteEntity.setCitta( cliente.getCitta() );
        clienteEntity.setNazione( cliente.getNazione() );
        clienteEntity.setDataIns( cliente.getDataIns() );
        clienteEntity.setDataAgg( cliente.getDataAgg() );

        return clienteEntity;
    }

    @Override
    public List<Cliente> convertFromEntity(List<ClienteEntity> clientiEntity) {
        if ( clientiEntity == null ) {
            return null;
        }

        List<Cliente> list = new ArrayList<Cliente>( clientiEntity.size() );
        for ( ClienteEntity clienteEntity : clientiEntity ) {
            list.add( convertFromEntity( clienteEntity ) );
        }

        return list;
    }

    @Override
    public List<ClienteEntity> convertToEntity(List<Cliente> clienti) {
        if ( clienti == null ) {
            return null;
        }

        List<ClienteEntity> list = new ArrayList<ClienteEntity>( clienti.size() );
        for ( Cliente cliente : clienti ) {
            list.add( convertToEntity( cliente ) );
        }

        return list;
    }
}
