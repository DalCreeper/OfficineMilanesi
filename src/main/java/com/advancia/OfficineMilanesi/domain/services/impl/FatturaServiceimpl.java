package com.advancia.OfficineMilanesi.domain.services.impl;

import com.advancia.OfficineMilanesi.domain.model.Fattura;
import com.advancia.OfficineMilanesi.domain.repository.dao.FatturaDaoService;
import com.advancia.OfficineMilanesi.domain.services.FatturaService;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class FatturaServiceimpl implements FatturaService {
    @EJB
    private FatturaDaoService fatturaDaoService;

    @Override
    public List<Fattura> getFatture() {
        return fatturaDaoService.getFatture();
    }

    @Override
    public List<Fattura> getFattureByIdFiliale(long id) {
        return fatturaDaoService.getFattureByIdFiliale(id);
    }

    @Override
    public List<Fattura> getFattureByIdCliente(long id) {
        return fatturaDaoService.getFattureByIdCliente(id);
    }

    @Override
    public List<Fattura> getFattureByIdMeccanico(long id) {
        return fatturaDaoService.getFattureByIdMeccanico(id);
    }

    @Override
    public List<Fattura> getFattureByIdVeicolo(long id) {
        return fatturaDaoService.getFattureByIdVeicolo(id);
    }

    @Override
    public void deleteFattura(long id) {
        fatturaDaoService.deleteFattura(id);
    }
}