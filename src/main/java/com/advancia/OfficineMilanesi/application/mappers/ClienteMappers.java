package com.advancia.OfficineMilanesi.application.mappers;

import com.advancia.OfficineMilanesi.application.model.ClienteDto;
import com.advancia.OfficineMilanesi.domain.model.Cliente;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ClienteMappers {
    ClienteDto convertFromDomain(Cliente cliente);
    Cliente convertToDomain(ClienteDto clienteDto);

    List<ClienteDto> convertFromDomain(List<Cliente> clienti);
    List<Cliente> convertToDomain(List<ClienteDto> clientiDto);
}