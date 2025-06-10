package com.advancia.OfficineMilanesi.infrastructure.services.impl;

import com.advancia.OfficineMilanesi.domain.repository.procedures.GeneraFattureRandomDBService;
import com.advancia.OfficineMilanesi.infrastructure.exceptions.DBException;
import com.advancia.OfficineMilanesi.infrastructure.procedures.GeneraFattureRandom;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class GeneraFattureRandomDBServiceImpl implements GeneraFattureRandomDBService {
    @PersistenceContext
    private EntityManager em;

    private final GeneraFattureRandom generaFattureRandom = new GeneraFattureRandom();

    @Override
    public void generaFattureRandom() {
        try {
            generaFattureRandom.getFattureRandom(em);
        } catch(Exception e) {
            throw new DBException("Errore cercando di eseguire la procedura genera_fatture_random", e);
        }
    }
}