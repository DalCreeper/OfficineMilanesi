package com.advancia.OfficineMilanesi.application.services.impl;

import com.advancia.OfficineMilanesi.application.mappers.ClienteMappers;
import com.advancia.OfficineMilanesi.application.model.ClienteDto;
import com.advancia.OfficineMilanesi.application.services.ClienteEJBService;
import com.advancia.OfficineMilanesi.domain.model.Cliente;
import com.advancia.OfficineMilanesi.domain.services.ClienteService;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class ClienteEJBServiceImpl implements ClienteEJBService {
    @EJB
    private ClienteService clienteService;
    @Inject
    private ClienteMappers clienteMappers;

    @Override
    public List<ClienteDto> getAllClienti() {
        List<Cliente> clienti = clienteService.getAllClienti();
        return clienteMappers.convertFromDomain(clienti);
    }

    @Override
    public ClienteDto getClienteById(int id) {
        Cliente cliente = clienteService.getClienteById(id);
        return clienteMappers.convertFromDomain(cliente);
    }

    @Override
    public void createCliente(ClienteDto clienteDto) {
        Cliente cliente = clienteMappers.convertToDomain(clienteDto);
        clienteService.createCliente(cliente);
    }

    @Override
    public void updateCliente(int id, ClienteDto clienteAgg) {
        Cliente cliente = clienteMappers.convertToDomain(clienteAgg);
        clienteService.updateCliente(id, cliente);
    }

    @Override
    public void deleteCliente(int id) {
        clienteService.deleteCliente(id);
    }
}