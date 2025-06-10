package com.advancia.OfficineMilanesi.application.api.rest;

import com.advancia.OfficineMilanesi.application.services.GeneraFattureRandomEJBService;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/procedures")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProceduresRestController {
    @EJB
    private GeneraFattureRandomEJBService generaFattureRandomService;

    @GET
    @Path("/genera_fatture_random")
    public Response generaFattureRandom() {
        generaFattureRandomService.generaFattureRandom();
        return Response.status(Response.Status.CREATED).build();
    }
}