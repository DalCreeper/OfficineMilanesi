package com.advancia.OfficineMilanesi.infrastructure.dao;

import com.advancia.OfficineMilanesi.infrastructure.exceptions.DBException;
import com.advancia.OfficineMilanesi.infrastructure.model.FilialeEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class FilialeDao {
    private static final String GET_FILIALI = "SELECT f FROM FilialeEntity f";
    private static final String GET_FILIALE_BY_ID = "SELECT f FROM FilialeEntity f WHERE f.id = :id";

    public List<FilialeEntity> getAllFiliali(EntityManager em) {
        try {
            TypedQuery<FilialeEntity> query = em.createQuery(GET_FILIALI, FilialeEntity.class);
            return query.getResultList();
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare le filiali dal DB.", e);
        }
    }

    public FilialeEntity getFilialeById(long id, EntityManager em) {
        try {
            return em.createQuery(GET_FILIALE_BY_ID, FilialeEntity.class).setParameter("id", id).getSingleResult();
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare la filiale con ID: " + id, e);
        }
    }

    public void createFiliale(FilialeEntity f, EntityManager em) {
        try {
            em.persist(f);
        } catch(Exception e) {
            throw new DBException("Errore cercando di inserire la filiale", e);
        }
    }

    public void updateFiliale(long id, FilialeEntity f, EntityManager em) {
        try {
            FilialeEntity existingFilialeEntity = em.find(FilialeEntity.class, id);
            if(existingFilialeEntity != null) {
                existingFilialeEntity.setRagSociale(f.getRagSociale());
                existingFilialeEntity.setPIva(f.getPIva());
                existingFilialeEntity.setCodFiscale(f.getCodFiscale());
                existingFilialeEntity.setPec(f.getPec());
                existingFilialeEntity.setTelefono(f.getTelefono());
                existingFilialeEntity.setIndirizzo(f.getIndirizzo());
                existingFilialeEntity.setCap(f.getCap());
                existingFilialeEntity.setProvincia(f.getProvincia());
                existingFilialeEntity.setCitta(f.getCitta());
                existingFilialeEntity.setNazione(f.getNazione());
                existingFilialeEntity.setNomeOfficina(f.getNomeOfficina());
                existingFilialeEntity.setDataIns(f.getDataIns());
                existingFilialeEntity.setDataAgg(f.getDataAgg());
                em.merge(existingFilialeEntity);
            } else {
                throw new DBException("Filiale con ID " + id + " non trovato.");
            }
        } catch(Exception e) {
            throw new DBException("Errore cercando di aggiornare la filiale con ID: " + id, e);
        }
    }

    public void deleteFiliale(long id, EntityManager em) {
        try {
            FilialeEntity filialeEntity = em.find(FilialeEntity.class, id);
            if(filialeEntity != null) {
                em.remove(filialeEntity);
            } else {
                throw new DBException("Filiale con ID " + id + " non trovato.");
            }
        } catch(Exception e) {
            throw new DBException("Errore durante la rimozione della filiale con ID: " + id, e);
        }
    }
}