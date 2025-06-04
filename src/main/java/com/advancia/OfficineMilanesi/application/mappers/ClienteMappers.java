package com.advancia.OfficineMilanesi.application.mappers;

import com.advancia.OfficineMilanesi.domain.model.Cliente;
import org.mapstruct.Mapper;

@Mapper
public interface ClienteMappers {
    ClienteDto convertFromDomain(Cliente cliente);
    Cliente convertToDomain(ClienteDto clienteDto);
}
