package domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author abraham
 */
@Entity
@Table(name = "evento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Evento.findAll", query = "SELECT e FROM Evento e"),
    @NamedQuery(name = "Evento.findByIdevento", query = "SELECT e FROM Evento e WHERE e.idevento = :idevento"),
    @NamedQuery(name = "Evento.findByNombre", query = "SELECT e FROM Evento e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Evento.findByAnio", query = "SELECT e FROM Evento e WHERE e.anio = :anio"),
    @NamedQuery(name = "Evento.findByMes", query = "SELECT e FROM Evento e WHERE e.mes = :mes"),
    @NamedQuery(name = "Evento.findByDia", query = "SELECT e FROM Evento e WHERE e.dia = :dia"),
    @NamedQuery(name = "Evento.findByHora", query = "SELECT e FROM Evento e WHERE e.hora = :hora"),
    @NamedQuery(name = "Evento.findByMinuto", query = "SELECT e FROM Evento e WHERE e.minuto = :minuto"),
    @NamedQuery(name = "Evento.findBySegundo", query = "SELECT e FROM Evento e WHERE e.segundo = :segundo"),
    @NamedQuery(name = "Evento.findByDuracion", query = "SELECT e FROM Evento e WHERE e.duracion = :duracion")})
public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idevento")
    private Integer idevento;
    @Size(max = 255)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "anio")
    private Integer anio;
    @Column(name = "mes")
    private Integer mes;
    @Column(name = "dia")
    private Integer dia;
    @Column(name = "hora")
    private Integer hora;
    @Column(name = "minuto")
    private Integer minuto;
    @Column(name = "segundo")
    private Integer segundo;
    @Column(name = "duracion")
    private Integer duracion;
    @JoinColumn(name = "calendario_idcalendario", referencedColumnName = "idcalendario")
    @ManyToOne(optional = false)
    private Calendario calendarioIdcalendario;

    public Evento() {
    }

    public Evento(Integer idevento) {
        this.idevento = idevento;
    }

    public Integer getIdevento() {
        return idevento;
    }

    public void setIdevento(Integer idevento) {
        this.idevento = idevento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public Integer getMinuto() {
        return minuto;
    }

    public void setMinuto(Integer minuto) {
        this.minuto = minuto;
    }

    public Integer getSegundo() {
        return segundo;
    }

    public void setSegundo(Integer segundo) {
        this.segundo = segundo;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Calendario getCalendarioIdcalendario() {
        return calendarioIdcalendario;
    }

    public void setCalendarioIdcalendario(Calendario calendarioIdcalendario) {
        this.calendarioIdcalendario = calendarioIdcalendario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idevento != null ? idevento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evento)) {
            return false;
        }
        Evento other = (Evento) object;
        if ((this.idevento == null && other.idevento != null) || (this.idevento != null && !this.idevento.equals(other.idevento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Evento[ idevento=" + idevento + " ]";
    }
    
}
