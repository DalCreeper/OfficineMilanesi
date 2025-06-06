package com.advancia.OfficineMilanesi.infrastructure.dao;

import com.advancia.OfficineMilanesi.infrastructure.exceptions.DBException;
import com.advancia.OfficineMilanesi.infrastructure.model.FatturaEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class FatturaDao {
    private static final String GET_FATTURE = "SELECT f FROM FatturaEntity f "
                                            + "JOIN FETCH f.filialeEntity "
                                            + "JOIN FETCH f.clienteEntity "
                                            + "JOIN FETCH f.meccanicoEntity "
                                            + "JOIN FETCH f.veicoloEntity";
    private static final String GET_FATTURE_BY_ID_FILIALE = "SELECT f FROM FatturaEntity f "
                                                          + "JOIN FETCH f.filialeEntity "
                                                          + "JOIN FETCH f.clienteEntity "
                                                          + "JOIN FETCH f.meccanicoEntity "
                                                          + "JOIN FETCH f.veicoloEntity "
                                                          + "WHERE f.filialeEntity.id = :id";
    private static final String GET_FATTURE_BY_ID_CLIENTE = "SELECT f FROM FatturaEntity f "
                                                          + "JOIN FETCH f.filialeEntity "
                                                          + "JOIN FETCH f.clienteEntity "
                                                          + "JOIN FETCH f.meccanicoEntity "
                                                          + "JOIN FETCH f.veicoloEntity "
                                                          + "WHERE f.clienteEntity.id = :id";
    private static final String GET_FATTURE_BY_ID_MECCANICO = "SELECT f FROM FatturaEntity f "
                                                          + "JOIN FETCH f.filialeEntity "
                                                          + "JOIN FETCH f.clienteEntity "
                                                          + "JOIN FETCH f.meccanicoEntity "
                                                          + "JOIN FETCH f.veicoloEntity "
                                                          + "WHERE f.meccanicoEntity.id = :id";
    private static final String GET_FATTURE_BY_ID_VEICOLO = "SELECT f FROM FatturaEntity f "
                                                          + "JOIN FETCH f.filialeEntity "
                                                          + "JOIN FETCH f.clienteEntity "
                                                          + "JOIN FETCH f.meccanicoEntity "
                                                          + "JOIN FETCH f.veicoloEntity "
                                                          + "WHERE f.veicoloEntity.id = :id";

    public List<FatturaEntity> getFatture(EntityManager em) {
        try {
            TypedQuery<FatturaEntity> query = em.createQuery(GET_FATTURE, FatturaEntity.class);
            return query.getResultList();
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare le fatture dal DB.", e);
        }
    }

    public List<FatturaEntity> getFattureByIdFiliale(long id, EntityManager em) {
        try {
            TypedQuery<FatturaEntity> query = em.createQuery(GET_FATTURE_BY_ID_FILIALE, FatturaEntity.class).setParameter("id", id);
            return query.getResultList();
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare le fatture tramite ID filiale: " + id, e);
        }
    }

    public List<FatturaEntity> getFattureByIdCliente(long id, EntityManager em) {
        try {
            TypedQuery<FatturaEntity> query = em.createQuery(GET_FATTURE_BY_ID_CLIENTE, FatturaEntity.class).setParameter("id", id);
            return query.getResultList();
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare le fatture tramite ID cliente: " + id, e);
        }
    }

    public List<FatturaEntity> getFattureByIdMeccanico(long id, EntityManager em) {
        try {
            TypedQuery<FatturaEntity> query = em.createQuery(GET_FATTURE_BY_ID_MECCANICO, FatturaEntity.class).setParameter("id", id);
            return query.getResultList();
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare le fatture tramite ID meccanico: " + id, e);
        }
    }

    public List<FatturaEntity> getFattureByIdVeicolo(long id, EntityManager em) {
        try {
            TypedQuery<FatturaEntity> query = em.createQuery(GET_FATTURE_BY_ID_VEICOLO, FatturaEntity.class).setParameter("id", id);
            return query.getResultList();
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare le fatture tramite ID veicolo: " + id, e);
        }
    }

    public void deleteFattura(long id, EntityManager em) {
        try {
            FatturaEntity fatturaEntity = em.find(FatturaEntity.class, id);
            if(fatturaEntity != null) {
                em.remove(fatturaEntity);
            } else {
                throw new DBException("Fattura con ID " + id + " non trovata.");
            }
        } catch(Exception e) {
            throw new DBException("Errore durante la rimozione della fattura con ID: " + id, e);
        }
    }
}