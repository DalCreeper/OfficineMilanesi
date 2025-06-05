package com.advancia.OfficineMilanesi.domain.services;

import com.advancia.OfficineMilanesi.domain.model.Fattura;

import java.util.List;

public interface FatturaService {
    List<Fattura> getFatture();
    List<Fattura> getFattureByIdFiliale(int id);
    List<Fattura> getFattureByIdCliente(int id);
    List<Fattura> getFattureByIdMeccanico(int id);
    List<Fattura> getFattureByIdVeicolo(int id);
    void deleteFattura(int id);
}