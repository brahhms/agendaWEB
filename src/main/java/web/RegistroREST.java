package web;

import domain.Registro;
import eis.RegistroFacade;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Path;

/**
 *
 * @author abraham
 */
@Stateless
@Path("registro")
public class RegistroREST extends AbstractRest<Registro>{
    
    @Inject
    RegistroFacade facade;

    @Override
    protected RegistroFacade facade() {
        return facade;
    }


}
