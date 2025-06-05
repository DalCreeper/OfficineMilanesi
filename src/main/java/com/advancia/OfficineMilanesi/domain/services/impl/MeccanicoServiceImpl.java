package com.advancia.OfficineMilanesi.domain.services.impl;

import com.advancia.OfficineMilanesi.domain.model.Meccanico;
import com.advancia.OfficineMilanesi.domain.repository.MeccanicoDaoService;
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
    public Meccanico getMeccanicoById(int id) {
        return meccanicoDaoService.getMeccanicoById(id);
    }

    @Override
    public void createMeccanico(Meccanico meccanico) {
        meccanicoDaoService.createMeccanico(meccanico);
    }

    @Override
    public void updateMeccanico(int id, Meccanico meccanicoAgg) {
        meccanicoDaoService.updateMeccanico(id, meccanicoAgg);
    }

    @Override
    public void deleteMeccanico(int id) {
        meccanicoDaoService.deleteMeccanico(id);
    }
}