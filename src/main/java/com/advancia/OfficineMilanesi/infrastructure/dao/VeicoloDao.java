package com.advancia.OfficineMilanesi.infrastructure.dao;

import com.advancia.OfficineMilanesi.infrastructure.exceptions.DBException;
import com.advancia.OfficineMilanesi.infrastructure.model.VeicoloEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class VeicoloDao {
    private static final String GET_VEICOLI = "SELECT v FROM VeicoloEntity v "
                                            + "JOIN FETCH v.clienteEntity";
    private static final String GET_VEICOLO_BY_ID = "SELECT v FROM VeicoloEntity v "
                                                  + "JOIN FETCH v.clienteEntity "
                                                  + "WHERE v.id = :id";

    public List<VeicoloEntity> getAllVeicoli(EntityManager em) {
        try {
            TypedQuery<VeicoloEntity> query = em.createQuery(GET_VEICOLI, VeicoloEntity.class);
            return query.getResultList();
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare i veicoli dal DB.", e);
        }
    }

    public VeicoloEntity getVeicoloById(int id, EntityManager em) {
        try {
            return em.createQuery(GET_VEICOLO_BY_ID, VeicoloEntity.class).setParameter("id", id).getSingleResult();
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare il veicolo con ID: " + id, e);
        }
    }

    public void createVeicolo(VeicoloEntity v, EntityManager em) {
        try {
            em.persist(v);
        } catch(Exception e) {
            throw new DBException("Errore cercando di inserire il veicolo", e);
        }
    }

    public void updateVeicolo(int id, VeicoloEntity v, EntityManager em) {
        try {
            VeicoloEntity existingVeicoloEntity = em.find(VeicoloEntity.class, id);
            if(existingVeicoloEntity != null) {
                existingVeicoloEntity.setModelloVett(v.getModelloVett());
                existingVeicoloEntity.setTelaio(v.getTelaio());
                existingVeicoloEntity.setTarga(v.getTarga());
                existingVeicoloEntity.setMotore(v.getMotore());
                existingVeicoloEntity.setCilindrata(v.getCilindrata());
                existingVeicoloEntity.setDataImmatr(v.getDataImmatr());
                existingVeicoloEntity.setDataVendita(v.getDataVendita());
                existingVeicoloEntity.setStato(v.getStato());
                existingVeicoloEntity.setKmPercorsi(v.getKmPercorsi());
                existingVeicoloEntity.setClienteEntity(v.getClienteEntity());
                existingVeicoloEntity.setDataIns(v.getDataIns());
                existingVeicoloEntity.setDataAgg(v.getDataAgg());
                em.merge(existingVeicoloEntity);
            } else {
                throw new DBException("Veicolo con ID " + id + " non trovato.");
            }
        } catch(Exception e) {
            throw new DBException("Errore cercando di aggiornare il veicolo con ID: " + id, e);
        }
    }

    public void deleteVeicolo(int id, EntityManager em) {
        try {
            VeicoloEntity veicoloEntity = em.find(VeicoloEntity.class, id);
            if(veicoloEntity != null) {
                em.remove(veicoloEntity);
            } else {
                throw new DBException("Veicolo con ID " + id + " non trovato.");
            }
        } catch(Exception e) {
            throw new DBException("Errore durante la rimozione del veicolo con ID: " + id, e);
        }
    }
}