package com.advancia.OfficineMilanesi.domain.repository;

import com.advancia.OfficineMilanesi.domain.model.Filiale;

import java.util.List;

public interface FilialeDaoService {
    List<Filiale> getAllFiliali();
    Filiale getFilialeById(int id);
    void createFiliale(Filiale filiale);
    void updateFiliale(int id, Filiale filialeAgg);
    void deleteFiliale(int id);
}