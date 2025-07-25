package com.advancia.OfficineMilanesi.domain.services.impl;

import com.advancia.OfficineMilanesi.domain.model.Filiale;
import com.advancia.OfficineMilanesi.domain.repository.dao.FilialeDaoService;
import com.advancia.OfficineMilanesi.domain.services.FilialeService;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class FilialeServiceImpl implements FilialeService {
    @EJB
    private FilialeDaoService filialeDaoService;

    @Override
    public List<Filiale> getAllFiliali() {
        return filialeDaoService.getAllFiliali();
    }

    @Override
    public Filiale getFilialeById(long id) {
        return filialeDaoService.getFilialeById(id);
    }

    @Override
    public void createFiliale(Filiale filiale) {
        filialeDaoService.createFiliale(filiale);
    }

    @Override
    public void updateFiliale(long id, Filiale filialeAgg) {
        filialeDaoService.updateFiliale(id, filialeAgg);
    }

    @Override
    public void deleteFiliale(long id) {
        filialeDaoService.deleteFiliale(id);
    }
}