package com.advancia.OfficineMilanesi.infrastructure.services.impl;

import com.advancia.OfficineMilanesi.domain.model.Cliente;
import com.advancia.OfficineMilanesi.domain.repository.dao.ClienteDaoService;
import com.advancia.OfficineMilanesi.infrastructure.dao.ClienteDao;
import com.advancia.OfficineMilanesi.infrastructure.exceptions.DBException;
import com.advancia.OfficineMilanesi.infrastructure.mappers.ClienteEntityMappers;
import com.advancia.OfficineMilanesi.infrastructure.model.ClienteEntity;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class ClienteDaoServiceImpl implements ClienteDaoService {
    @PersistenceContext
    private EntityManager em;
    @Inject
    private ClienteEntityMappers clienteEntityMappers;
    private final ClienteDao clienteDao = new ClienteDao();

    @Override
    public List<Cliente> getAllClienti() {
        try {
            List<ClienteEntity> clienti = clienteDao.getAllClienti(em);
            return clienteEntityMappers.convertFromEntity(clienti);
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare i clienti.", e);
        }
    }

    @Override
    public Cliente getClienteById(long id) {
        try {
            ClienteEntity clienteEntity = clienteDao.getClienteById(id, em);
            return clienteEntityMappers.convertFromEntity(clienteEntity);
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare il cliente con ID: " + id, e);
        }
    }

    @Override
    public void createCliente(Cliente cliente) {
        try {
            ClienteEntity clienteEntity = clienteEntityMappers.convertToEntity(cliente);
            clienteDao.createCliente(clienteEntity, em);
        } catch(Exception e) {
            throw new DBException("Errore durante la creazione del cliente.", e);
        }
    }

    @Override
    public void updateCliente(long id, Cliente clienteAgg) {
        try {
            ClienteEntity clienteEntity = clienteEntityMappers.convertToEntity(clienteAgg);
            clienteDao.updateCliente(id, clienteEntity, em);
        } catch(Exception e) {
            throw new DBException("Errore cercando di aggiornare il cliente con ID: " + id, e);
        }
    }

    @Override
    public void deleteCliente(long id) {
        try {
            clienteDao.deleteCliente(id, em);
        } catch(Exception e) {
            throw new DBException("Errore cercando di eliminare il cliente con ID: " + id, e);
        }
    }
}