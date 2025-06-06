package com.advancia.OfficineMilanesi.application.services.impl;

import com.advancia.OfficineMilanesi.application.mappers.FilialeMappers;
import com.advancia.OfficineMilanesi.application.model.FilialeDto;
import com.advancia.OfficineMilanesi.application.services.FilialeEJBService;
import com.advancia.OfficineMilanesi.domain.model.Filiale;
import com.advancia.OfficineMilanesi.domain.services.FilialeService;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class FilialeEJBServiceImpl implements FilialeEJBService {
    @EJB
    private FilialeService filialeService;
    @Inject
    private FilialeMappers filialeMappers;

    @Override
    public List<FilialeDto> getAllFiliali() {
        List<Filiale> filiali = filialeService.getAllFiliali();
        return filialeMappers.convertFromDomain(filiali);
    }

    @Override
    public FilialeDto getFilialeById(long id) {
        Filiale filiale = filialeService.getFilialeById(id);
        return filialeMappers.convertFromDomain(filiale);
    }

    @Override
    public void createFiliale(FilialeDto filialeDto) {
        Filiale filiale = filialeMappers.convertToDomain(filialeDto);
        filialeService.createFiliale(filiale);
    }

    @Override
    public void updateFiliale(long id, FilialeDto filialeAgg) {
        Filiale filiale = filialeMappers.convertToDomain(filialeAgg);
        filialeService.updateFiliale(id, filiale);
    }

    @Override
    public void deleteFiliale(long id) {
        filialeService.deleteFiliale(id);
    }
}