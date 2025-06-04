package com.advancia.OfficineMilanesi.infrastructure.mappers;

import com.advancia.OfficineMilanesi.domain.model.Cliente;
import com.advancia.OfficineMilanesi.infrastructure.model.ClienteEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ClienteEntityMappers {
    Cliente convertFromEntity(ClienteEntity clienteEntity);
    ClienteEntity convertToEntity(Cliente cliente);
}
