package com.advancia.OfficineMilanesi.infrastructure.dao;

import com.advancia.OfficineMilanesi.infrastructure.exceptions.DBException;
import com.advancia.OfficineMilanesi.infrastructure.model.MeccanicoEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class MeccanicoDao {
    private static final String GET_MECCANICI = "SELECT m FROM MeccanicoEntity m";
    private static final String GET_MECCANICO_BY_ID = "SELECT m FROM MeccanicoEntity m WHERE m.id = :id";

    public List<MeccanicoEntity> getAllMeccanici(EntityManager em) {
        try {
            TypedQuery<MeccanicoEntity> query = em.createQuery(GET_MECCANICI, MeccanicoEntity.class);
            return query.getResultList();
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare i meccanici dal DB.", e);
        }
    }

    public MeccanicoEntity getMeccanicoById(int id, EntityManager em) {
        try {
            return em.createQuery(GET_MECCANICO_BY_ID, MeccanicoEntity.class).setParameter("id", id).getSingleResult();
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare il meccanico con ID: " + id, e);
        }
    }

    public void createMeccanico(MeccanicoEntity m, EntityManager em) {
        try {
            em.persist(m);
        } catch(Exception e) {
            throw new DBException("Errore cercando di inserire il meccanico", e);
        }
    }

    public void updateMeccanico(int id, MeccanicoEntity m, EntityManager em) {
        try {
            MeccanicoEntity existingMeccanicoEntity = em.find(MeccanicoEntity.class, id);
            if(existingMeccanicoEntity != null) {
                existingMeccanicoEntity.setNome(m.getNome());
                existingMeccanicoEntity.setCognome(m.getCognome());
                existingMeccanicoEntity.setCodFiscale(m.getCodFiscale());
                existingMeccanicoEntity.setTelefono(m.getTelefono());
                existingMeccanicoEntity.setDataIns(m.getDataIns());
                existingMeccanicoEntity.setDataAgg(m.getDataAgg());
                em.merge(existingMeccanicoEntity);
            } else {
                throw new DBException("Meccanico con ID " + id + " non trovato.");
            }
        } catch(Exception e) {
            throw new DBException("Errore cercando di aggiornare il meccanico con ID: " + id, e);
        }
    }

    public void deleteMeccanico(int id, EntityManager em) {
        try {
            MeccanicoEntity meccanicoEntity = em.find(MeccanicoEntity.class, id);
            if(meccanicoEntity != null) {
                em.remove(meccanicoEntity);
            } else {
                throw new DBException("Meccanico con ID " + id + " non trovato.");
            }
        } catch(Exception e) {
            throw new DBException("Errore durante la rimozione del meccanico con ID: " + id, e);
        }
    }
}