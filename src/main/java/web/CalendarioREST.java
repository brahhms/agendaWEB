package web;

import domain.Calendario;
import eis.CalendarioFacade;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Path;

/**
 *
 * @author abraham
 */
@Stateless
@Path("calendario")
public class CalendarioREST extends AbstractRest<Calendario>{

    @Inject
    CalendarioFacade facade;

    @Override
    protected CalendarioFacade facade() {
        return facade;
    }
        

}
