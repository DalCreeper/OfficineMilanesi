package com.advancia.OfficineMilanesi.domain.services.impl;

import com.advancia.OfficineMilanesi.domain.model.Articolo;
import com.advancia.OfficineMilanesi.domain.repository.ArticoloDaoService;
import com.advancia.OfficineMilanesi.domain.services.ArticoloService;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class ArticoloServiceImpl implements ArticoloService {
    @EJB
    private ArticoloDaoService articoloDaoService;

    @Override
    public List<Articolo> getAllArticoli() {
        return articoloDaoService.getAllArticoli();
    }

    @Override
    public Articolo getArticoloById(int id) {
        return articoloDaoService.getArticoloById(id);
    }

    @Override
    public void createArticolo(Articolo articolo) {
        articoloDaoService.createArticolo(articolo);
    }

    @Override
    public void updateArticolo(int id, Articolo articoloAgg) {
        articoloDaoService.updateArticolo(id, articoloAgg);
    }

    @Override
    public void deleteArticolo(int id) {
        articoloDaoService.deleteArticolo(id);
    }
}