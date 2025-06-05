package com.advancia.OfficineMilanesi.application.services;

import com.advancia.OfficineMilanesi.application.model.FilialeDto;

import java.util.List;

public interface FilialeEJBService {
    List<FilialeDto> getAllFiliali();
    FilialeDto getFilialeById(int id);
    void createFiliale(FilialeDto filialeDto);
    void updateFiliale(int id, FilialeDto filialeAgg);
    void deleteFiliale(int id);
}