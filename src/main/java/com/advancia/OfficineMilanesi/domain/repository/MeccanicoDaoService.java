package com.advancia.OfficineMilanesi.domain.repository;

import com.advancia.OfficineMilanesi.domain.model.Meccanico;

import java.util.List;

public interface MeccanicoDaoService {
    List<Meccanico> getAllMeccanici();
    Meccanico getMeccanicoById(int id);
    void createMeccanico(Meccanico meccanico);
    void updateMeccanico(int id, Meccanico meccanicoAgg);
    void deleteMeccanico(int id);
}