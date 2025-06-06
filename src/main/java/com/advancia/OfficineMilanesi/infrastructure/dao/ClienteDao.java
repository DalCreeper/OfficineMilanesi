package com.advancia.OfficineMilanesi.infrastructure.dao;

import com.advancia.OfficineMilanesi.infrastructure.exceptions.DBException;
import com.advancia.OfficineMilanesi.infrastructure.model.ClienteEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class ClienteDao {
    private static final String GET_CLIENTI = "SELECT c FROM ClienteEntity c";
    private static final String GET_CLIENTE_BY_ID = "SELECT c FROM ClienteEntity c WHERE c.id = :id";

    public List<ClienteEntity> getAllClienti(EntityManager em) {
        try {
            TypedQuery<ClienteEntity> query = em.createQuery(GET_CLIENTI, ClienteEntity.class);
            return query.getResultList();
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare i clienti dal DB.", e);
        }
    }

    public ClienteEntity getClienteById(long id, EntityManager em) {
        try {
            return em.createQuery(GET_CLIENTE_BY_ID, ClienteEntity.class).setParameter("id", id).getSingleResult();
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare il cliente con ID: " + id, e);
        }
    }

    public void createCliente(ClienteEntity c, EntityManager em) {
        try {
            em.persist(c);
        } catch(Exception e) {
            throw new DBException("Errore cercando di inserire il cliente", e);
        }
    }

    public void updateCliente(long id, ClienteEntity c, EntityManager em) {
        try {
            ClienteEntity existingClienteEntity = em.find(ClienteEntity.class, id);
            if(existingClienteEntity != null) {
                existingClienteEntity.setRagSociale(c.getRagSociale());
                existingClienteEntity.setPIva(c.getPIva());
                existingClienteEntity.setCodFiscale(c.getCodFiscale());
                existingClienteEntity.setPec(c.getPec());
                existingClienteEntity.setTelefono(c.getTelefono());
                existingClienteEntity.setIndirizzo(c.getIndirizzo());
                existingClienteEntity.setCap(c.getCap());
                existingClienteEntity.setProvincia(c.getProvincia());
                existingClienteEntity.setCitta(c.getCitta());
                existingClienteEntity.setNazione(c.getNazione());
                existingClienteEntity.setDataIns(c.getDataIns());
                existingClienteEntity.setDataAgg(c.getDataAgg());
                em.merge(existingClienteEntity);
            } else {
                throw new DBException("Cliente con ID " + id + " non trovato.");
            }
        } catch(Exception e) {
            throw new DBException("Errore cercando di aggiornare il cliente con ID: " + id, e);
        }
    }

    public void deleteCliente(long id, EntityManager em) {
        try {
            ClienteEntity clienteEntity = em.find(ClienteEntity.class, id);
            if(clienteEntity != null) {
                em.remove(clienteEntity);
            } else {
                throw new DBException("Cliente con ID " + id + " non trovato.");
            }
        } catch(Exception e) {
            throw new DBException("Errore durante la rimozione del cliente con ID: " + id, e);
        }
    }
}