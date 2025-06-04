package com.advancia.OfficineMilanesi.domain.repository;

import com.advancia.OfficineMilanesi.domain.model.Veicolo;

import java.util.List;

public interface VeicoloDaoService {
    List<Veicolo> getAllVeicoli();
    Veicolo getVeicoloById(int id);
    void createVeicolo(Veicolo veicolo);
    void updateVeicolo(int id, Veicolo veicoloAgg);
    void deleteVeicolo(int id);
}