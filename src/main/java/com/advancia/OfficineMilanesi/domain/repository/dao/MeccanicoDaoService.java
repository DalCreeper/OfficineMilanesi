package com.advancia.OfficineMilanesi.domain.repository.dao;

import com.advancia.OfficineMilanesi.domain.model.Meccanico;

import java.util.List;

public interface MeccanicoDaoService {
    List<Meccanico> getAllMeccanici();
    Meccanico getMeccanicoById(long id);
    void createMeccanico(Meccanico meccanico);
    void updateMeccanico(long id, Meccanico meccanicoAgg);
    void deleteMeccanico(long id);
}