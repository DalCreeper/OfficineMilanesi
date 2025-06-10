package com.advancia.OfficineMilanesi.domain.services.impl;

import com.advancia.OfficineMilanesi.domain.model.Cliente;
import com.advancia.OfficineMilanesi.domain.repository.dao.ClienteDaoService;
import com.advancia.OfficineMilanesi.domain.services.ClienteService;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class ClienteServiceImpl implements ClienteService {
    @EJB
    private ClienteDaoService clienteDaoService;

    @Override
    public List<Cliente> getAllClienti() {
        return clienteDaoService.getAllClienti();
    }

    @Override
    public Cliente getClienteById(long id) {
        return clienteDaoService.getClienteById(id);
    }

    @Override
    public void createCliente(Cliente cliente) {
        clienteDaoService.createCliente(cliente);
    }

    @Override
    public void updateCliente(long id, Cliente clienteAgg) {
        clienteDaoService.updateCliente(id, clienteAgg);
    }

    @Override
    public void deleteCliente(long id) {
        clienteDaoService.deleteCliente(id);
    }
}