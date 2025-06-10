package com.advancia.OfficineMilanesi.domain.repository.dao;

import com.advancia.OfficineMilanesi.domain.model.Fattura;

import java.util.List;

public interface FatturaDaoService {
    List<Fattura> getFatture();
    List<Fattura> getFattureByIdFiliale(long id);
    List<Fattura> getFattureByIdCliente(long id);
    List<Fattura> getFattureByIdMeccanico(long id);
    List<Fattura> getFattureByIdVeicolo(long id);
    void deleteFattura(long id);
}
