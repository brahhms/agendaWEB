package eis;

import domain.Calendario;
import domain.Evento;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author abraham
 */
@Stateless
public class EventoFacade extends AbstractFacade<Evento> {

    @PersistenceContext(unitName = "calendarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EventoFacade() {
        super(Evento.class);
    }
    

    //SELECT * FROM `evento` WHERE calendario_idcalendario=1 AND anio=2020 AND mes=3 
    public List<Evento> findByCalendarioDate(Integer anio, Integer mes, Integer calendarioId) {
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Evento> cq = cb.createQuery(Evento.class);
        
        Root<Evento> evento = cq.from(Evento.class);

        Predicate[] predicates = new Predicate[3];
        predicates[0] = cb.equal(evento.get("anio"), anio);
        predicates[1] = cb.equal(evento.get("mes"), mes);
        predicates[2] = cb.equal(evento.get("calendarioIdcalendario"), new Calendario(calendarioId));
              
        
        cq.select(evento).where(predicates);

        return getEntityManager().createQuery(cq).getResultList();
    }
    
        //SELECT * FROM `evento` WHERE  anio=2020 AND mes=3 
    public List<Evento> findByDate(Integer anio, Integer mes) {
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Evento> cq = cb.createQuery(Evento.class);
        
        Root<Evento> evento = cq.from(Evento.class);

        Predicate[] predicates = new Predicate[2];
        predicates[0] = cb.equal(evento.get("anio"), anio);
        predicates[1] = cb.equal(evento.get("mes"), mes);
              
        
        cq.select(evento).where(predicates);

        return getEntityManager().createQuery(cq).getResultList();
    }
    
}
