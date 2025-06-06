package com.advancia.OfficineMilanesi.application.services;

import com.advancia.OfficineMilanesi.application.model.ArticoloDto;
import com.advancia.OfficineMilanesi.application.model.FatturaDto;
import com.advancia.OfficineMilanesi.application.model.MeccanicoDto;
import com.advancia.OfficineMilanesi.application.model.VeicoloDto;

import java.util.List;

public interface FatturaElementsEJBService {
    List<ArticoloDto> getAllArticoli();
    ArticoloDto getArticoloById(long id);
    void createArticolo(ArticoloDto articoloDto);
    void updateArticolo(long id, ArticoloDto articoloAgg);
    void deleteArticolo(long id);
    /* -------------------------------------------------------------------------------------------------------------- */
    List<FatturaDto> getFatture();
    List<FatturaDto> getFattureByIdFiliale(long id);
    List<FatturaDto> getFattureByIdCliente(long id);
    List<FatturaDto> getFattureByIdMeccanico(long id);
    List<FatturaDto> getFattureByIdVeicolo(long id);
    void deleteFattura(long id);
    /* -------------------------------------------------------------------------------------------------------------- */
    List<MeccanicoDto> getAllMeccanici();
    MeccanicoDto getMeccanicoById(long id);
    void createMeccanico(MeccanicoDto meccanicoDto);
    void updateMeccanico(long id, MeccanicoDto meccanicoAgg);
    void deleteMeccanico(long id);
    /* -------------------------------------------------------------------------------------------------------------- */
    List<VeicoloDto> getAllVeicoli();
    VeicoloDto getVeicoloById(long id);
    void createVeicolo(VeicoloDto veicoloDto);
    void updateVeicolo(long id, VeicoloDto veicoloAgg);
    void deleteVeicolo(long id);
}