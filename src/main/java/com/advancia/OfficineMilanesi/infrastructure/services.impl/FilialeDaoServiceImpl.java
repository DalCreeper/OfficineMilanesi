package com.advancia.OfficineMilanesi.infrastructure.services.impl;

import com.advancia.OfficineMilanesi.domain.model.Filiale;
import com.advancia.OfficineMilanesi.domain.repository.FilialeDaoService;
import com.advancia.OfficineMilanesi.infrastructure.dao.FilialeDao;
import com.advancia.OfficineMilanesi.infrastructure.exceptions.DBException;
import com.advancia.OfficineMilanesi.infrastructure.mappers.FilialeEntityMappers;
import com.advancia.OfficineMilanesi.infrastructure.model.FilialeEntity;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class FilialeDaoServiceImpl implements FilialeDaoService {
    @PersistenceContext
    private EntityManager em;
    @Inject
    private FilialeEntityMappers filialeEntityMappers;
    private final FilialeDao filialeDao = new FilialeDao();

    @Override
    public List<Filiale> getAllFiliali() {
        try {
            List<FilialeEntity> filiali = filialeDao.getAllFiliali(em);
            return filialeEntityMappers.convertFromEntity(filiali);
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare le filiali.", e);
        }
    }

    @Override
    public Filiale getFilialeById(long id) {
        try {
            FilialeEntity filialeEntity = filialeDao.getFilialeById(id, em);
            return filialeEntityMappers.convertFromEntity(filialeEntity);
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare la filiale con ID: " + id, e);
        }
    }

    @Override
    public void createFiliale(Filiale filiale) {
        try {
            FilialeEntity filialeEntity = filialeEntityMappers.convertToEntity(filiale);
            filialeDao.createFiliale(filialeEntity, em);
        } catch(Exception e) {
            throw new DBException("Errore durante la creazione della filiale.", e);
        }
    }

    @Override
    public void updateFiliale(long id, Filiale filialeAgg) {
        try {
            FilialeEntity filialeEntity = filialeEntityMappers.convertToEntity(filialeAgg);
            filialeDao.updateFiliale(id, filialeEntity, em);
        } catch(Exception e) {
            throw new DBException("Errore cercando di aggiornare la filiale con ID: " + id, e);
        }
    }

    @Override
    public void deleteFiliale(long id) {
        try {
            filialeDao.deleteFiliale(id, em);
        } catch(Exception e) {
            throw new DBException("Errore cercando di eliminare la filiale con ID: " + id, e);
        }
    }
}