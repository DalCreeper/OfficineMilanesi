package com.advancia.OfficineMilanesi.domain.services;

import com.advancia.OfficineMilanesi.domain.model.Meccanico;

import java.util.List;

public interface MeccanicoService {
    List<Meccanico> getAllMeccanici();
    Meccanico getMeccanicoById(long id);
    void createMeccanico(Meccanico meccanico);
    void updateMeccanico(long id, Meccanico meccanicoAgg);
    void deleteMeccanico(long id);
}