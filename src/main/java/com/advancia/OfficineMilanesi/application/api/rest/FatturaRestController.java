package com.advancia.OfficineMilanesi.application.api.rest;

import com.advancia.OfficineMilanesi.application.model.*;
import com.advancia.OfficineMilanesi.application.services.FatturaElementsEJBService;
import com.advancia.OfficineMilanesi.application.exceptions.NotFoundException;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/fattura-elements")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class FatturaRestController {
    @EJB
    private FatturaElementsEJBService fattElemService;

    /* -------------------------------------------------------------------------------------------------------------- */

    @GET
    @Path("/articoli")
    public List<ArticoloDto> getAllArticoli() {
        return fattElemService.getAllArticoli();
    }

    @GET
    @Path("/articoli/{id}")
    public ArticoloDto getArticoloById(@PathParam("id") int id) {
        ArticoloDto articoloDto = fattElemService.getArticoloById(id);
        if(articoloDto == null) {
            throw new NotFoundException("Articolo con id " + id + " non trovato.");
        }
        return articoloDto;
    }

    @POST
    @Path("/articoli")
    public Response createArticolo(ArticoloDto articolodto) {
        fattElemService.createArticolo(articolodto);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/articoli/{id}")
    public Response updateArticolo(@PathParam("id") int id, ArticoloDto articoloAgg) {
        fattElemService.updateArticolo(id, articoloAgg);
        return Response.ok().build();
    }

    @DELETE
    @Path("/articoli/{id}")
    public Response deleteArticolo(@PathParam("id") int id) {
        fattElemService.deleteArticolo(id);
        return Response.noContent().build();
    }

    /* -------------------------------------------------------------------------------------------------------------- */

    @GET
    @Path("/fatture")
    public List<FatturaDto> getAllFatture() {
        return fattElemService.getFatture();
    }

    @GET
    @Path("/fatture/filiale/{id}")
    public List<FatturaDto> getFattureByFiliale(@PathParam("id") int id) {
        return fattElemService.getFattureByIdFiliale(id);
    }

    @GET
    @Path("/fatture/cliente/{id}")
    public List<FatturaDto> getFattureByCliente(@PathParam("id") int id) {
        return fattElemService.getFattureByIdCliente(id);
    }

    @GET
    @Path("/fatture/meccanico/{id}")
    public List<FatturaDto> getFattureByMeccanico(@PathParam("id") int id) {
        return fattElemService.getFattureByIdMeccanico(id);
    }

    @GET
    @Path("/fatture/veicolo/{id}")
    public List<FatturaDto> getFattureByVeicolo(@PathParam("id") int id) {
        return fattElemService.getFattureByIdVeicolo(id);
    }

    @DELETE
    @Path("/fatture/{id}")
    public Response deleteFattura(@PathParam("id") int id) {
        fattElemService.deleteFattura(id);
        return Response.noContent().build();
    }

    /* -------------------------------------------------------------------------------------------------------------- */

    @GET
    @Path("/meccanici")
    public List<MeccanicoDto> getAllMeccanici() {
        return fattElemService.getAllMeccanici();
    }

    @GET
    @Path("/meccanici/{id}")
    public MeccanicoDto getMeccanicoById(@PathParam("id") int id) {
        MeccanicoDto meccanicoDto = fattElemService.getMeccanicoById(id);
        if(meccanicoDto == null) throw new NotFoundException("Meccanico con id " + id + " non trovato.");
        return meccanicoDto;
    }

    @POST
    @Path("/meccanici")
    public Response createMeccanico(MeccanicoDto meccanicoDto) {
        fattElemService.createMeccanico(meccanicoDto);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/meccanici/{id}")
    public Response updateMeccanico(@PathParam("id") int id, MeccanicoDto meccanicoAgg) {
        fattElemService.updateMeccanico(id, meccanicoAgg);
        return Response.ok().build();
    }

    @DELETE
    @Path("/meccanici/{id}")
    public Response deleteMeccanico(@PathParam("id") int id) {
        fattElemService.deleteMeccanico(id);
        return Response.noContent().build();
    }

    /* -------------------------------------------------------------------------------------------------------------- */

    @GET
    @Path("/veicoli")
    public List<VeicoloDto> getAllVeicoli() {
        return fattElemService.getAllVeicoli();
    }

    @GET
    @Path("/veicoli/{id}")
    public VeicoloDto getVeicoloById(@PathParam("id") int id) {
        VeicoloDto veicoloDto = fattElemService.getVeicoloById(id);
        if(veicoloDto == null) throw new NotFoundException("Veicolo con id " + id + " non trovato.");
        return veicoloDto;
    }

    @POST
    @Path("/veicoli")
    public Response createVeicolo(VeicoloDto veicoloDto) {
        fattElemService.createVeicolo(veicoloDto);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/veicoli/{id}")
    public Response updateVeicolo(@PathParam("id") int id, VeicoloDto veicoloAgg) {
        fattElemService.updateVeicolo(id, veicoloAgg);
        return Response.ok().build();
    }

    @DELETE
    @Path("/veicoli/{id}")
    public Response deleteVeicolo(@PathParam("id") int id) {
        fattElemService.deleteVeicolo(id);
        return Response.noContent().build();
    }
}