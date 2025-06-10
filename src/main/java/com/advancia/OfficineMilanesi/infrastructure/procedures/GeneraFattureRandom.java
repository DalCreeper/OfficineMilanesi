package com.advancia.OfficineMilanesi.infrastructure.procedures;

import com.advancia.OfficineMilanesi.infrastructure.exceptions.DBException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

public class GeneraFattureRandom {
    public void getFattureRandom(EntityManager em) {
        try {
            em.createNamedStoredProcedureQuery("Fattura.generaRandom").execute();
        } catch(PersistenceException e) {
            throw new DBException("Errore cercando di eseguire la procedura genera_fatture_random dal DB.", e);
        }
    }
}