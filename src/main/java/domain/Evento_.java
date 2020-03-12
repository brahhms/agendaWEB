package domain;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 *
 * @author abraham
 */
@StaticMetamodel(Evento.class)
public class Evento_ {
    public static volatile SingularAttribute<Evento, Integer> id;
    public static volatile SingularAttribute<Evento, String> nombre;
    public static volatile SingularAttribute<Evento, Integer> anio;
    public static volatile SingularAttribute<Evento, Integer> mes;
    public static volatile SingularAttribute<Evento, Integer> dia;
    public static volatile SingularAttribute<Evento, Integer> hora;
    public static volatile SingularAttribute<Evento, Integer> minuto;
    public static volatile SingularAttribute<Evento, Integer> segundo;
    public static volatile SingularAttribute<Evento, Integer> duracion;
    public static volatile SingularAttribute<Evento, Calendario> calendarioIdcalendario;
}
