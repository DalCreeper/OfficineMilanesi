package com.advancia.OfficineMilanesi.application.services.impl;

import com.advancia.OfficineMilanesi.application.mappers.*;
import com.advancia.OfficineMilanesi.application.model.ArticoloDto;
import com.advancia.OfficineMilanesi.application.model.FatturaDto;
import com.advancia.OfficineMilanesi.application.model.MeccanicoDto;
import com.advancia.OfficineMilanesi.application.model.VeicoloDto;
import com.advancia.OfficineMilanesi.application.services.FatturaElementsEJBService;
import com.advancia.OfficineMilanesi.domain.model.*;
import com.advancia.OfficineMilanesi.domain.services.*;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class FatturaElementsEJBServiceImpl implements FatturaElementsEJBService {
    @EJB
    private ArticoloService articoloService;
    @EJB
    private FatturaService fatturaService;
    @EJB
    private MeccanicoService meccanicoService;
    @EJB
    private VeicoloService veicoloService;
    @Inject
    private ArticoloMappers articoloMappers;
    @Inject
    private FatturaMappers fatturaMappers;
    @Inject
    private MeccanicoMappers meccanicoMappers;
    @Inject
    private VeicoloMappers veicoloMappers;

    @Override
    public List<ArticoloDto> getAllArticoli() {
        List<Articolo> articoli = articoloService.getAllArticoli();
        return articoloMappers.convertFromDomain(articoli);
    }

    @Override
    public ArticoloDto getArticoloById(int id) {
        Articolo articolo = articoloService.getArticoloById(id);
        return articoloMappers.convertFromDomain(articolo);
    }

    @Override
    public void createArticolo(ArticoloDto articoloDto) {
        Articolo articolo = articoloMappers.convertToDomain(articoloDto);
        articoloService.createArticolo(articolo);
    }

    @Override
    public void updateArticolo(int id, ArticoloDto articoloAgg) {
        Articolo articolo = articoloMappers.convertToDomain(articoloAgg);
        articoloService.updateArticolo(id, articolo);
    }

    @Override
    public void deleteArticolo(int id) {
        articoloService.deleteArticolo(id);
    }

    /* -------------------------------------------------------------------------------------------------------------- */

    @Override
    public List<FatturaDto> getFatture() {
        List<Fattura> fatture = fatturaService.getFatture();
        return fatturaMappers.convertFromDomain(fatture);
    }

    @Override
    public List<FatturaDto> getFattureByIdFiliale(int id) {
        List<Fattura> fatture = fatturaService.getFattureByIdFiliale(id);
        return fatturaMappers.convertFromDomain(fatture);
    }

    @Override
    public List<FatturaDto> getFattureByIdCliente(int id) {
        List<Fattura> fatture = fatturaService.getFattureByIdCliente(id);
        return fatturaMappers.convertFromDomain(fatture);
    }

    @Override
    public List<FatturaDto> getFattureByIdMeccanico(int id) {
        List<Fattura> fatture = fatturaService.getFattureByIdMeccanico(id);
        return fatturaMappers.convertFromDomain(fatture);
    }

    @Override
    public List<FatturaDto> getFattureByIdVeicolo(int id) {
        List<Fattura> fatture = fatturaService.getFattureByIdVeicolo(id);
        return fatturaMappers.convertFromDomain(fatture);
    }

    @Override
    public void deleteFattura(int id) {
        fatturaService.deleteFattura(id);
    }

    /* -------------------------------------------------------------------------------------------------------------- */

    @Override
    public List<MeccanicoDto> getAllMeccanici() {
        List<Meccanico> meccanici = meccanicoService.getAllMeccanici();
        return meccanicoMappers.convertFromDomain(meccanici);
    }

    @Override
    public MeccanicoDto getMeccanicoById(int id) {
        Meccanico meccanico = meccanicoService.getMeccanicoById(id);
        return meccanicoMappers.convertFromDomain(meccanico);
    }

    @Override
    public void createMeccanico(MeccanicoDto meccanicoDto) {
        Meccanico meccanico = meccanicoMappers.convertToDomain(meccanicoDto);
        meccanicoService.createMeccanico(meccanico);
    }

    @Override
    public void updateMeccanico(int id, MeccanicoDto meccanicoAgg) {
        Meccanico meccanico = meccanicoMappers.convertToDomain(meccanicoAgg);
        meccanicoService.updateMeccanico(id, meccanico);
    }

    @Override
    public void deleteMeccanico(int id) {
        meccanicoService.deleteMeccanico(id);
    }

    /* -------------------------------------------------------------------------------------------------------------- */

    @Override
    public List<VeicoloDto> getAllVeicoli() {
        List<Veicolo> veicoli = veicoloService.getAllVeicoli();
        return veicoloMappers.convertFromDomain(veicoli);
    }

    @Override
    public VeicoloDto getVeicoloById(int id) {
        Veicolo veicolo = veicoloService.getVeicoloById(id);
        return veicoloMappers.convertFromDomain(veicolo);
    }

    @Override
    public void createVeicolo(VeicoloDto veicoloDto) {
        Veicolo veicolo = veicoloMappers.convertToDomain(veicoloDto);
        veicoloService.createVeicolo(veicolo);
    }

    @Override
    public void updateVeicolo(int id, VeicoloDto veicoloAgg) {
        Veicolo veicolo = veicoloMappers.convertToDomain(veicoloAgg);
        veicoloService.updateVeicolo(id, veicolo);
    }

    @Override
    public void deleteVeicolo(int id) {
        veicoloService.deleteVeicolo(id);
    }
}