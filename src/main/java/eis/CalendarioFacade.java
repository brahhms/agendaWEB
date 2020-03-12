package eis;

import domain.Calendario;
import domain.Evento;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author abraham
 */
@Stateless
public class CalendarioFacade extends AbstractFacade<Calendario> {

    @PersistenceContext(unitName = "calendarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CalendarioFacade() {
        super(Calendario.class);
    }
    
    /*
    public List<Evento> findEventos(Integer anio,Integer mes,Integer calendarioId){
        List<Evento> detailsList = new ArrayList<>();
        List<Evento> eventos = null;
        
        
        try {
            Calendario calendario = em.find(Calendario.class, calendarioId);
            eventos = calendario.getEventoList();
        } catch (Exception ex) {
            throw new EJBException(ex);
        }
        
        Iterator<Evento> i = eventos.iterator();
        while (i.hasNext()) {
            Evento evento = (Evento) i.next();
            if (evento.getAnio() == anio && evento.getMes() == mes) {
                detailsList.add(evento);
            }
        }
        return detailsList;
    
    }
    */    

}
