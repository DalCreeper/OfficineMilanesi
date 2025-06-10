package com.advancia.OfficineMilanesi.application.services.impl;

import com.advancia.OfficineMilanesi.application.services.GeneraFattureRandomEJBService;
import com.advancia.OfficineMilanesi.domain.services.GeneraFattureRandomService;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class GeneraFattureRandomEJBServiceImpl implements GeneraFattureRandomEJBService {
    @EJB
    private GeneraFattureRandomService generaFattureRandomService;

    @Override
    public void generaFattureRandom() {
        generaFattureRandomService.generaFattureRandom();
    }
}