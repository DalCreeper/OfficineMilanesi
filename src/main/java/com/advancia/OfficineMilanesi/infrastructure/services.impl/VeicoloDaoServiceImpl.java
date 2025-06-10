package com.advancia.OfficineMilanesi.infrastructure.services.impl;

import com.advancia.OfficineMilanesi.domain.model.Veicolo;
import com.advancia.OfficineMilanesi.domain.repository.dao.VeicoloDaoService;
import com.advancia.OfficineMilanesi.infrastructure.dao.VeicoloDao;
import com.advancia.OfficineMilanesi.infrastructure.exceptions.DBException;
import com.advancia.OfficineMilanesi.infrastructure.mappers.VeicoloEntityMappers;
import com.advancia.OfficineMilanesi.infrastructure.model.ClienteEntity;
import com.advancia.OfficineMilanesi.infrastructure.model.VeicoloEntity;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class VeicoloDaoServiceImpl implements VeicoloDaoService {
    @PersistenceContext
    private EntityManager em;
    @Inject
    private VeicoloEntityMappers veicoloEntityMappers;
    private final VeicoloDao veicoloDao = new VeicoloDao();

    @Override
    public List<Veicolo> getAllVeicoli() {
        try {
            List<VeicoloEntity> veicoli = veicoloDao.getAllVeicoli(em);
            return veicoloEntityMappers.convertFromEntity(veicoli);
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare i veicoli.", e);
        }
    }

    @Override
    public Veicolo getVeicoloById(long id) {
        try {
            VeicoloEntity veicoloEntity = veicoloDao.getVeicoloById(id, em);
            return veicoloEntityMappers.convertFromEntity(veicoloEntity);
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare il veicolo con ID: " + id, e);
        }
    }

    @Override
    public void createVeicolo(Veicolo veicolo) {
        try {
            VeicoloEntity veicoloEntity = veicoloEntityMappers.convertToEntity(veicolo);
            ClienteEntity c = new ClienteEntity();
            c.setId(veicolo.getCliente().getId());
            veicoloEntity.setClienteEntity(c);
            veicoloDao.createVeicolo(veicoloEntity, em);
        } catch(Exception e) {
            throw new DBException("Errore durante la creazione del veicolo.", e);
        }
    }

    @Override
    public void updateVeicolo(long id, Veicolo veicoloAgg) {
        try {
            VeicoloEntity veicoloEntity = veicoloEntityMappers.convertToEntity(veicoloAgg);
            ClienteEntity c = new ClienteEntity();
            c.setId(veicoloAgg.getCliente().getId());
            veicoloEntity.setClienteEntity(c);
            veicoloDao.updateVeicolo(id, veicoloEntity, em);
        } catch(Exception e) {
            throw new DBException("Errore cercando di aggiornare il veicolo con ID: " + id, e);
        }
    }

    @Override
    public void deleteVeicolo(long id) {
        try {
            veicoloDao.deleteVeicolo(id, em);
        } catch(Exception e) {
            throw new DBException("Errore cercando di eliminare il veicolo con ID: " + id, e);
        }
    }
}