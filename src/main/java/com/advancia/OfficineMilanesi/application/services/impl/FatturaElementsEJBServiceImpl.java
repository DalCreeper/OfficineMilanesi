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
    public ArticoloDto getArticoloById(long id) {
        Articolo articolo = articoloService.getArticoloById(id);
        return articoloMappers.convertFromDomain(articolo);
    }

    @Override
    public void createArticolo(ArticoloDto articoloDto) {
        Articolo articolo = articoloMappers.convertToDomain(articoloDto);
        articoloService.createArticolo(articolo);
    }

    @Override
    public void updateArticolo(long id, ArticoloDto articoloAgg) {
        Articolo articolo = articoloMappers.convertToDomain(articoloAgg);
        articoloService.updateArticolo(id, articolo);
    }

    @Override
    public void deleteArticolo(long id) {
        articoloService.deleteArticolo(id);
    }

    /* -------------------------------------------------------------------------------------------------------------- */

    @Override
    public List<FatturaDto> getFatture() {
        List<Fattura> fatture = fatturaService.getFatture();
        return fatturaMappers.convertFromDomain(fatture);
    }

    @Override
    public List<FatturaDto> getFattureByIdFiliale(long id) {
        List<Fattura> fatture = fatturaService.getFattureByIdFiliale(id);
        return fatturaMappers.convertFromDomain(fatture);
    }

    @Override
    public List<FatturaDto> getFattureByIdCliente(long id) {
        List<Fattura> fatture = fatturaService.getFattureByIdCliente(id);
        return fatturaMappers.convertFromDomain(fatture);
    }

    @Override
    public List<FatturaDto> getFattureByIdMeccanico(long id) {
        List<Fattura> fatture = fatturaService.getFattureByIdMeccanico(id);
        return fatturaMappers.convertFromDomain(fatture);
    }

    @Override
    public List<FatturaDto> getFattureByIdVeicolo(long id) {
        List<Fattura> fatture = fatturaService.getFattureByIdVeicolo(id);
        return fatturaMappers.convertFromDomain(fatture);
    }

    @Override
    public void deleteFattura(long id) {
        fatturaService.deleteFattura(id);
    }

    /* -------------------------------------------------------------------------------------------------------------- */

    @Override
    public List<MeccanicoDto> getAllMeccanici() {
        List<Meccanico> meccanici = meccanicoService.getAllMeccanici();
        return meccanicoMappers.convertFromDomain(meccanici);
    }

    @Override
    public MeccanicoDto getMeccanicoById(long id) {
        Meccanico meccanico = meccanicoService.getMeccanicoById(id);
        return meccanicoMappers.convertFromDomain(meccanico);
    }

    @Override
    public void createMeccanico(MeccanicoDto meccanicoDto) {
        Meccanico meccanico = meccanicoMappers.convertToDomain(meccanicoDto);
        meccanicoService.createMeccanico(meccanico);
    }

    @Override
    public void updateMeccanico(long id, MeccanicoDto meccanicoAgg) {
        Meccanico meccanico = meccanicoMappers.convertToDomain(meccanicoAgg);
        meccanicoService.updateMeccanico(id, meccanico);
    }

    @Override
    public void deleteMeccanico(long id) {
        meccanicoService.deleteMeccanico(id);
    }

    /* -------------------------------------------------------------------------------------------------------------- */

    @Override
    public List<VeicoloDto> getAllVeicoli() {
        List<Veicolo> veicoli = veicoloService.getAllVeicoli();
        return veicoloMappers.convertFromDomain(veicoli);
    }

    @Override
    public VeicoloDto getVeicoloById(long id) {
        Veicolo veicolo = veicoloService.getVeicoloById(id);
        return veicoloMappers.convertFromDomain(veicolo);
    }

    @Override
    public void createVeicolo(VeicoloDto veicoloDto) {
        Veicolo veicolo = veicoloMappers.convertToDomain(veicoloDto);
        Cliente c = new Cliente();
        c.setId(veicoloDto.getClienteDto().getId());
        veicolo.setCliente(c);
        veicoloService.createVeicolo(veicolo);
    }

    @Override
    public void updateVeicolo(long id, VeicoloDto veicoloAgg) {
        Veicolo veicolo = veicoloMappers.convertToDomain(veicoloAgg);
        Cliente c = new Cliente();
        c.setId(veicoloAgg.getClienteDto().getId());
        veicolo.setCliente(c);
        veicoloService.updateVeicolo(id, veicolo);
    }

    @Override
    public void deleteVeicolo(long id) {
        veicoloService.deleteVeicolo(id);
    }
}