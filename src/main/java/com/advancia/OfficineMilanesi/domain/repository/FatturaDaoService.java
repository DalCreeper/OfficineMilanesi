package com.advancia.OfficineMilanesi.domain.repository;

import com.advancia.OfficineMilanesi.domain.model.Fattura;

import java.util.List;

public interface FatturaDaoService {
    List<Fattura> getFatture();
    List<Fattura> getFattureByIdFiliale(int id);
    List<Fattura> getFattureByIdCliente(int id);
    List<Fattura> getFattureByIdMeccanico(int id);
    List<Fattura> getFattureByIdVeicolo(int id);
    void deleteFattura(int id);
}
