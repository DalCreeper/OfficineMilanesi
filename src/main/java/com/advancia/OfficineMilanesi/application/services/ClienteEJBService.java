package com.advancia.OfficineMilanesi.application.services;

import com.advancia.OfficineMilanesi.application.model.ClienteDto;

import java.util.List;

public interface ClienteEJBService {
    List<ClienteDto> getAllClienti();
    ClienteDto getClienteById(int id);
    void createCliente(ClienteDto clienteDto);
    void updateCliente(int id, ClienteDto clienteAgg);
    void deleteCliente(int id);
}