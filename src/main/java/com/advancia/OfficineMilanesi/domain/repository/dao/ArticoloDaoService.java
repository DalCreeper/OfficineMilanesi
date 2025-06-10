package com.advancia.OfficineMilanesi.domain.repository.dao;

import com.advancia.OfficineMilanesi.domain.model.Articolo;

import java.util.List;

public interface ArticoloDaoService {
    List<Articolo> getAllArticoli();
    Articolo getArticoloById(long id);
    void createArticolo(Articolo articolo);
    void updateArticolo(long id, Articolo articoloAgg);
    void deleteArticolo(long id);
}