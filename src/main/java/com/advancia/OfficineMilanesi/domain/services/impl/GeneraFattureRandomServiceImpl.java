package com.advancia.OfficineMilanesi.domain.services.impl;

import com.advancia.OfficineMilanesi.domain.repository.procedures.GeneraFattureRandomDBService;
import com.advancia.OfficineMilanesi.domain.services.GeneraFattureRandomService;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class GeneraFattureRandomServiceImpl implements GeneraFattureRandomService {
    @EJB
    private GeneraFattureRandomDBService generaFattureRandomDBService;

    @Override
    public void generaFattureRandom() {
        generaFattureRandomDBService.generaFattureRandom();
    }
}