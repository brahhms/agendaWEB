package domain;

import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;


@StaticMetamodel(Calendario.class)
public class Calendario_ {
    public static volatile SingularAttribute<Calendario, Integer> idcalendario;
    public static volatile SingularAttribute<Calendario, String> nombre;
    public static volatile SingularAttribute<Calendario, String> color;
    public static volatile ListAttribute<Calendario, Evento> eventoList;
    public static volatile SingularAttribute<Calendario, Usuario> usuarioIdusuario;
}
