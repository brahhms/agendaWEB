package web;

import domain.Usuario;
import eis.UsuarioFacade;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Path;

/**
 *
 * @author abraham
 */
@Stateless
@Path("usuario")
public class UsuarioREST extends AbstractRest<Usuario>{

    @Inject
    UsuarioFacade facade;

   
    @Override
    protected UsuarioFacade facade() {
        return facade;
    }   
 


}
