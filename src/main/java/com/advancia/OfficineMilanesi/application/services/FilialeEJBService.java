package com.advancia.OfficineMilanesi.application.services;

import com.advancia.OfficineMilanesi.application.model.FilialeDto;

import java.util.List;

public interface FilialeEJBService {
    List<FilialeDto> getAllFiliali();
    FilialeDto getFilialeById(long id);
    void createFiliale(FilialeDto filialeDto);
    void updateFiliale(long id, FilialeDto filialeAgg);
    void deleteFiliale(long id);
}