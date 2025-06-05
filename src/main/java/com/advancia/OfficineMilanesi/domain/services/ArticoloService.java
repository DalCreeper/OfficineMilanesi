package com.advancia.OfficineMilanesi.domain.services;

import com.advancia.OfficineMilanesi.domain.model.Articolo;

import java.util.List;

public interface ArticoloService {
    List<Articolo> getAllArticoli();
    Articolo getArticoloById(int id);
    void createArticolo(Articolo articolo);
    void updateArticolo(int id, Articolo articoloAgg);
    void deleteArticolo(int id);
}