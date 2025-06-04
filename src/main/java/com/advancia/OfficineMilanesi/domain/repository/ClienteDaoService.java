package com.advancia.OfficineMilanesi.domain.repository;

import com.advancia.OfficineMilanesi.domain.model.Cliente;

import java.util.List;

public interface ClienteDaoService {
    List<Cliente> getAllClienti();
    Cliente getClienteById(int id);
    void createCliente(Cliente cliente);
    void updateCliente(int id, Cliente clienteAgg);
    void deleteCliente(int id);
}