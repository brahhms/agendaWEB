package domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author abraham
 */
@Entity
@Table(name = "registro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Registro.findAll", query = "SELECT r FROM Registro r"),
    @NamedQuery(name = "Registro.findByIdregistro", query = "SELECT r FROM Registro r WHERE r.idregistro = :idregistro"),
    @NamedQuery(name = "Registro.findByUtc", query = "SELECT r FROM Registro r WHERE r.utc = :utc"),
    @NamedQuery(name = "Registro.findByAnio", query = "SELECT r FROM Registro r WHERE r.anio = :anio"),
    @NamedQuery(name = "Registro.findByMes", query = "SELECT r FROM Registro r WHERE r.mes = :mes"),
    @NamedQuery(name = "Registro.findByDia", query = "SELECT r FROM Registro r WHERE r.dia = :dia"),
    @NamedQuery(name = "Registro.findByDiasemana", query = "SELECT r FROM Registro r WHERE r.diasemana = :diasemana"),
    @NamedQuery(name = "Registro.findByHora", query = "SELECT r FROM Registro r WHERE r.hora = :hora"),
    @NamedQuery(name = "Registro.findByMinuto", query = "SELECT r FROM Registro r WHERE r.minuto = :minuto"),
    @NamedQuery(name = "Registro.findBySegundo", query = "SELECT r FROM Registro r WHERE r.segundo = :segundo"),
    @NamedQuery(name = "Registro.findByIp", query = "SELECT r FROM Registro r WHERE r.ip = :ip"),
    @NamedQuery(name = "Registro.findByNavegador", query = "SELECT r FROM Registro r WHERE r.navegador = :navegador"),
    @NamedQuery(name = "Registro.findByResolucion", query = "SELECT r FROM Registro r WHERE r.resolucion = :resolucion")})
public class Registro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idregistro")
    private Integer idregistro;
    @Column(name = "utc")
    private Integer utc;
    @Column(name = "anio")
    private Integer anio;
    @Column(name = "mes")
    private Integer mes;
    @Column(name = "dia")
    private Integer dia;
    @Column(name = "diasemana")
    private Integer diasemana;
    @Column(name = "hora")
    private Integer hora;
    @Column(name = "minuto")
    private Integer minuto;
    @Column(name = "segundo")
    private Integer segundo;
    @Column(name = "ip")
    private Integer ip;
    @Column(name = "navegador")
    private Integer navegador;
    @Column(name = "resolucion")
    private Integer resolucion;

    public Registro() {
    }

    public Registro(Integer idregistro) {
        this.idregistro = idregistro;
    }

    public Integer getIdregistro() {
        return idregistro;
    }

    public void setIdregistro(Integer idregistro) {
        this.idregistro = idregistro;
    }

    public Integer getUtc() {
        return utc;
    }

    public void setUtc(Integer utc) {
        this.utc = utc;
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

    public Integer getDiasemana() {
        return diasemana;
    }

    public void setDiasemana(Integer diasemana) {
        this.diasemana = diasemana;
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

    public Integer getIp() {
        return ip;
    }

    public void setIp(Integer ip) {
        this.ip = ip;
    }

    public Integer getNavegador() {
        return navegador;
    }

    public void setNavegador(Integer navegador) {
        this.navegador = navegador;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idregistro != null ? idregistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registro)) {
            return false;
        }
        Registro other = (Registro) object;
        if ((this.idregistro == null && other.idregistro != null) || (this.idregistro != null && !this.idregistro.equals(other.idregistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Registro[ idregistro=" + idregistro + " ]";
    }
    
}
