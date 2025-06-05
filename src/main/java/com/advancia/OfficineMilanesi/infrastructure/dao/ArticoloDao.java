package com.advancia.OfficineMilanesi.infrastructure.dao;

import com.advancia.OfficineMilanesi.infrastructure.exceptions.DBException;
import com.advancia.OfficineMilanesi.infrastructure.model.ArticoloEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class ArticoloDao {
    private static final String GET_ARTICOLI = "SELECT a FROM ArticoloEntity a";
    private static final String GET_ARTICOLO_BY_ID = "SELECT a FROM ArticoloEntity a WHERE a.id = :id";

    public List<ArticoloEntity> getAllArticoli(EntityManager em) {
        try {
            TypedQuery<ArticoloEntity> query = em.createQuery(GET_ARTICOLI, ArticoloEntity.class);
            return query.getResultList();
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare gli articoli dal DB.", e);
        }
    }

    public ArticoloEntity getArticoloById(int id, EntityManager em) {
        try {
            return em.createQuery(GET_ARTICOLO_BY_ID, ArticoloEntity.class).setParameter("id", id).getSingleResult();
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare l'articolo con ID: " + id, e);
        }
    }

    public void createArticolo(ArticoloEntity a, EntityManager em) {
        try {
            em.persist(a);
        } catch(Exception e) {
            throw new DBException("Errore cercando di inserire un articolo", e);
        }
    }

    public void updateArticolo(int id, ArticoloEntity a, EntityManager em) {
        try {
            ArticoloEntity existingArticoloEntity = em.find(ArticoloEntity.class, id);
            if(existingArticoloEntity != null) {
                existingArticoloEntity.setPosMagazzino(a.getPosMagazzino());
                existingArticoloEntity.setSf(a.getSf());
                existingArticoloEntity.setCodArticolo(a.getCodArticolo());
                existingArticoloEntity.setDescrizione(a.getDescrizione());
                existingArticoloEntity.setPrezzoUnit(a.getPrezzoUnit());
                existingArticoloEntity.setDataIns(a.getDataIns());
                existingArticoloEntity.setDataAgg(a.getDataAgg());
                em.merge(existingArticoloEntity);
            } else {
                throw new DBException("Articolo con ID " + id + " non trovato.");
            }
        } catch(Exception e) {
            throw new DBException("Errore cercando di aggiornare l'articolo con ID: " + id, e);
        }
    }

    public void deleteArticolo(int id, EntityManager em) {
        try {
            ArticoloEntity articoloEntity = em.find(ArticoloEntity.class, id);
            if(articoloEntity != null) {
                em.remove(articoloEntity);
            } else {
                throw new DBException("Articolo con ID " + id + " non trovato.");
            }
        } catch(Exception e) {
            throw new DBException("Errore durante la rimozione dell'articolo con ID: " + id, e);
        }
    }
}