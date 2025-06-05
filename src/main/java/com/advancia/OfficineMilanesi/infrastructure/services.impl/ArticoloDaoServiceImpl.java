package com.advancia.OfficineMilanesi.infrastructure.services.impl;

import com.advancia.OfficineMilanesi.domain.exceptions.DBException;
import com.advancia.OfficineMilanesi.domain.model.Articolo;
import com.advancia.OfficineMilanesi.domain.repository.ArticoloDaoService;
import com.advancia.OfficineMilanesi.infrastructure.dao.ArticoloDao;
import com.advancia.OfficineMilanesi.infrastructure.mappers.ArticoloEntityMappers;
import com.advancia.OfficineMilanesi.infrastructure.model.ArticoloEntity;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class ArticoloDaoServiceImpl implements ArticoloDaoService {
    @PersistenceContext
    private EntityManager em;
    @Inject
    private ArticoloEntityMappers articoloEntityMappers;
    private final ArticoloDao articoloDao = new ArticoloDao();

    @Override
    public List<Articolo> getAllArticoli() {
        try {
            List<ArticoloEntity> articoliEntity = articoloDao.getAllArticoli(em);
            return articoloEntityMappers.convertFromEntity(articoliEntity);
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare gli articoli.", e);
        }
    }

    @Override
    public Articolo getArticoloById(int id) {
        try {
            ArticoloEntity articoloEntity = articoloDao.getArticoloById(id, em);
            return articoloEntityMappers.convertFromEntity(articoloEntity);
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare l'articolo con ID: " + id, e);
        }
    }

    @Override
    public void createArticolo(Articolo articolo) {
        try {
            ArticoloEntity articoloEntity = articoloEntityMappers.convertToEntity(articolo);
            articoloDao.createArticolo(articoloEntity, em);
        } catch(Exception e) {
            throw new DBException("Errore durante la creazione dell'articolo.", e);
        }
    }

    @Override
    public void updateArticolo(int id, Articolo articoloAgg) {
        try {
            ArticoloEntity articoloEntity = articoloEntityMappers.convertToEntity(articoloAgg);
            articoloDao.updateArticolo(id, articoloEntity, em);
        } catch(Exception e) {
            throw new DBException("Errore cercando si aggiornare l'articolo con ID: " + id, e);
        }
    }

    @Override
    public void deleteArticolo(int id) {
        try {
            articoloDao.deleteArticolo(id, em);
        } catch(Exception e) {
            throw new DBException("Errore cercando di eliminare l'articolo con ID: " + id, e);
        }
    }
}