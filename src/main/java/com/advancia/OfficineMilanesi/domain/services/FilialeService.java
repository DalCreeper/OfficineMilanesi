package com.advancia.OfficineMilanesi.domain.services;

import com.advancia.OfficineMilanesi.domain.model.Filiale;

import java.util.List;

public interface FilialeService {
    List<Filiale> getAllFiliali();
    Filiale getFilialiById(int id);
    void createFiliale(Filiale filiale);
    void updateFiliale(int id, Filiale filialeAgg);
    void deleteFiliale(int id);
}