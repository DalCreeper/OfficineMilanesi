package com.advancia.OfficineMilanesi.application.api.rest;

import com.advancia.OfficineMilanesi.application.model.FilialeDto;
import com.advancia.OfficineMilanesi.application.services.FilialeEJBService;
import com.advancia.OfficineMilanesi.application.exceptions.NotFoundException;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/filiali")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class FilialeRestController {
    @EJB
    private FilialeEJBService filialeService;

    @GET
    public List<FilialeDto> getAllFiliali() {
        return filialeService.getAllFiliali();
    }

    @GET
    @Path("/{id}")
    public FilialeDto getFilialeById(@PathParam("id") long id) {
        FilialeDto filialeDto = filialeService.getFilialeById(id);
        if(filialeDto == null) throw new NotFoundException("Filiale con id " + id + " non trovata.");
        return filialeDto;
    }

    @POST
    public Response createFiliale(FilialeDto filialeDto) {
        filialeService.createFiliale(filialeDto);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/{id}")
    public Response updateFiliale(@PathParam("id") long id, FilialeDto filialeAgg) {
        filialeService.updateFiliale(id, filialeAgg);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteFiliale(@PathParam("id") long id) {
        filialeService.deleteFiliale(id);
        return Response.noContent().build();
    }
}