package com.advancia.OfficineMilanesi.domain.repository;

import com.advancia.OfficineMilanesi.domain.model.Filiale;

import java.util.List;

public interface FilialeDaoService {
    List<Filiale> getAllFiliali();
    Filiale getFilialeById(long id);
    void createFiliale(Filiale filiale);
    void updateFiliale(long id, Filiale filialeAgg);
    void deleteFiliale(long id);
}