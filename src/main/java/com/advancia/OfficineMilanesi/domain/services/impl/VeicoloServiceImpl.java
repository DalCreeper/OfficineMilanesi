package com.advancia.OfficineMilanesi.domain.services.impl;

import com.advancia.OfficineMilanesi.domain.model.Veicolo;
import com.advancia.OfficineMilanesi.domain.repository.VeicoloDaoService;
import com.advancia.OfficineMilanesi.domain.services.VeicoloService;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class VeicoloServiceImpl implements VeicoloService {
    @EJB
    private VeicoloDaoService veicoloDaoService;

    @Override
    public List<Veicolo> getAllVeicoli() {
        return veicoloDaoService.getAllVeicoli();
    }

    @Override
    public Veicolo getVeicoloById(long id) {
        return veicoloDaoService.getVeicoloById(id);
    }

    @Override
    public void createVeicolo(Veicolo veicolo) {
        veicoloDaoService.createVeicolo(veicolo);
    }

    @Override
    public void updateVeicolo(long id, Veicolo veicoloAgg) {
        veicoloDaoService.updateVeicolo(id, veicoloAgg);
    }

    @Override
    public void deleteVeicolo(long id) {
        veicoloDaoService.deleteVeicolo(id);
    }
}