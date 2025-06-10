package com.advancia.OfficineMilanesi.infrastructure.services.impl;

import com.advancia.OfficineMilanesi.domain.model.Fattura;
import com.advancia.OfficineMilanesi.domain.repository.dao.FatturaDaoService;
import com.advancia.OfficineMilanesi.infrastructure.dao.FatturaDao;
import com.advancia.OfficineMilanesi.infrastructure.exceptions.DBException;
import com.advancia.OfficineMilanesi.infrastructure.mappers.FatturaEntityMappers;
import com.advancia.OfficineMilanesi.infrastructure.model.FatturaEntity;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class FatturaDaoServiceImpl implements FatturaDaoService {
    @PersistenceContext
    private EntityManager em;
    @Inject
    private FatturaEntityMappers fatturaEntityMappers;
    private final FatturaDao fatturaDao = new FatturaDao();

    @Override
    public List<Fattura> getFatture() {
        try {
            List<FatturaEntity> fatture = fatturaDao.getFatture(em);
            return fatturaEntityMappers.convertFromEntity(fatture);
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare le fatture.", e);
        }
    }

    @Override
    public List<Fattura> getFattureByIdFiliale(long id) {
        try {
            List<FatturaEntity> fatture = fatturaDao.getFattureByIdFiliale(id, em);
            return fatturaEntityMappers.convertFromEntity(fatture);
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare le fatture con ID filiale: " + id, e);
        }
    }

    @Override
    public List<Fattura> getFattureByIdCliente(long id) {
        try {
            List<FatturaEntity> fatture = fatturaDao.getFattureByIdCliente(id, em);
            return fatturaEntityMappers.convertFromEntity(fatture);
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare le fatture con ID cliente: " + id, e);
        }
    }

    @Override
    public List<Fattura> getFattureByIdMeccanico(long id) {
        try {
            List<FatturaEntity> fatture = fatturaDao.getFattureByIdMeccanico(id, em);
            return fatturaEntityMappers.convertFromEntity(fatture);
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare le fatture con ID meccanico: " + id, e);
        }
    }

    @Override
    public List<Fattura> getFattureByIdVeicolo(long id) {
        try {
            List<FatturaEntity> fatture = fatturaDao.getFattureByIdVeicolo(id, em);
            return fatturaEntityMappers.convertFromEntity(fatture);
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare le fatture con ID veicolo: " + id, e);
        }
    }

    @Override
    public void deleteFattura(long id) {
        try {
            fatturaDao.deleteFattura(id, em);
        } catch(Exception e) {
            throw new DBException("Errore cercando di eliminare la fattura con ID: " + id, e);
        }
    }
}