package com.advancia.OfficineMilanesi.application.services;

import com.advancia.OfficineMilanesi.application.model.ClienteDto;

import java.util.List;

public interface ClienteEJBService {
    List<ClienteDto> getAllClienti();
    ClienteDto getClienteById(long id);
    void createCliente(ClienteDto clienteDto);
    void updateCliente(long id, ClienteDto clienteAgg);
    void deleteCliente(long id);
}