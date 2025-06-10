package com.advancia.OfficineMilanesi.domain.services.impl;

import com.advancia.OfficineMilanesi.domain.model.Meccanico;
import com.advancia.OfficineMilanesi.domain.repository.dao.MeccanicoDaoService;
import com.advancia.OfficineMilanesi.domain.services.MeccanicoService;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class MeccanicoServiceImpl implements MeccanicoService {
    @EJB
    private MeccanicoDaoService meccanicoDaoService;

    @Override
    public List<Meccanico> getAllMeccanici() {
        return meccanicoDaoService.getAllMeccanici();
    }

    @Override
    public Meccanico getMeccanicoById(long id) {
        return meccanicoDaoService.getMeccanicoById(id);
    }

    @Override
    public void createMeccanico(Meccanico meccanico) {
        meccanicoDaoService.createMeccanico(meccanico);
    }

    @Override
    public void updateMeccanico(long id, Meccanico meccanicoAgg) {
        meccanicoDaoService.updateMeccanico(id, meccanicoAgg);
    }

    @Override
    public void deleteMeccanico(long id) {
        meccanicoDaoService.deleteMeccanico(id);
    }
}