package com.advancia.OfficineMilanesi.domain.services;

import com.advancia.OfficineMilanesi.domain.model.Veicolo;

import java.util.List;

public interface VeicoloService {
    List<Veicolo> getAllVeicoli();
    Veicolo getVeicoloById(long id);
    void createVeicolo(Veicolo veicolo);
    void updateVeicolo(long id, Veicolo veicoloAgg);
    void deleteVeicolo(long id);
}