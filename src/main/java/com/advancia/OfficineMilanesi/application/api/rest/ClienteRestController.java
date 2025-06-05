package com.advancia.OfficineMilanesi.application.api.rest;

import com.advancia.OfficineMilanesi.application.model.ClienteDto;
import com.advancia.OfficineMilanesi.application.services.ClienteEJBService;
import com.advancia.OfficineMilanesi.application.exceptions.NotFoundException;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/clienti")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ClienteRestController {
    @EJB
    private ClienteEJBService ClienteService;

    @GET
    public List<ClienteDto> getAllClienti() {
        return ClienteService.getAllClienti();
    }

    @GET
    @Path("/{id}")
    public ClienteDto getClienteById(@PathParam("id") int id) {
        ClienteDto clienteDto = ClienteService.getClienteById(id);
        if(clienteDto == null) throw new NotFoundException("Cliente con id " + id + " non trovato.");
        return clienteDto;
    }

    @POST
    public Response createCliente(ClienteDto clienteDto) {
        ClienteService.createCliente(clienteDto);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/{id}")
    public Response updateCliente(@PathParam("id") int id, ClienteDto clienteAgg) {
        ClienteService.updateCliente(id, clienteAgg);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteCliente(@PathParam("id") int id) {
        ClienteService.deleteCliente(id);
        return Response.noContent().build();
    }
}