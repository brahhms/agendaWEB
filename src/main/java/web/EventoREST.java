package web;

import domain.Evento;
import eis.EventoFacade;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author abraham
 */
@Stateless
@Path("evento")
public class EventoREST extends AbstractRest<Evento>{

    @Inject
    EventoFacade facade;
       

    @Override
    protected EventoFacade facade() {
        return facade;
    }

        
    @GET
    @Path("/{calendarioId}/{anio}/{mes}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Evento> getEventosByDate(@PathParam("anio") Integer anio,@PathParam("mes") Integer mes,@PathParam("calendarioId") Integer calendarioId){
        return facade.findByCalendarioDate(anio, mes, calendarioId);
    }
    
    @GET
    @Path("/byDate/{anio}/{mes}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Evento> getEventosByDate(@PathParam("anio") Integer anio,@PathParam("mes") Integer mes){
        return facade.findByDate(anio, mes);
    }


    
}
