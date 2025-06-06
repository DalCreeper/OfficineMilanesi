package com.advancia.OfficineMilanesi.domain.repository;

import com.advancia.OfficineMilanesi.domain.model.Cliente;

import java.util.List;

public interface ClienteDaoService {
    List<Cliente> getAllClienti();
    Cliente getClienteById(long id);
    void createCliente(Cliente cliente);
    void updateCliente(long id, Cliente clienteAgg);
    void deleteCliente(long id);
}