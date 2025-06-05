package com.advancia.OfficineMilanesi.application.services;

import com.advancia.OfficineMilanesi.application.model.ArticoloDto;
import com.advancia.OfficineMilanesi.application.model.FatturaDto;
import com.advancia.OfficineMilanesi.application.model.MeccanicoDto;
import com.advancia.OfficineMilanesi.application.model.VeicoloDto;
import com.advancia.OfficineMilanesi.domain.model.Meccanico;

import java.util.List;

public interface FatturaElementsEJBService {
    List<ArticoloDto> getAllArticoli();
    ArticoloDto getArticoloById(int id);
    void createArticolo(ArticoloDto articoloDto);
    void updateArticolo(int id, ArticoloDto articoloAgg);
    void deleteArticolo(int id);
    /* -------------------------------------------------------------------------------------------------------------- */
    List<FatturaDto> getFatture();
    List<FatturaDto> getFattureByIdFiliale(int id);
    List<FatturaDto> getFattureByIdCliente(int id);
    List<FatturaDto> getFattureByIdMeccanico(int id);
    List<FatturaDto> getFattureByIdVeicolo(int id);
    void removeFatturaById(int id);
    /* -------------------------------------------------------------------------------------------------------------- */
    List<MeccanicoDto> getAllMeccanici();
    MeccanicoDto getMeccanicoById(int id);
    void createMeccanico(MeccanicoDto meccanicoDto);
    void updateMeccanico(int id, Meccanico meccanicoAgg);
    void deleteMeccanico(int id);
    /* -------------------------------------------------------------------------------------------------------------- */
    List<VeicoloDto> getAllVeicoli();
    VeicoloDto getVeicoloById(int id);
    void createVeicolo(VeicoloDto veicoloDto);
    void updateVeicolo(int id, VeicoloDto veicoloAgg);
    void deleteVeicolo(int id);
}