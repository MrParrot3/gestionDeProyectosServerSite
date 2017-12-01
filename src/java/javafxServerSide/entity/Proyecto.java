/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxServerSide.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;

/**
 * La clase Proyecto encapsula los datos de cada proyecto: 
 * <ul>
 *  <li>id is the identifier of the Proyecto.</li>
 *  <li>fechaEstimada es la fecha prevista de finalizacion el proyecto</li> 
 *  <li>fechaFinal es la fecha en la que se acaba el proyecto.</li>
 *  <li>concepto es la descripcion del proyecto</li>
 *  <li>importeEstimado es el precio que se estima que costara el proyecto.</li>
 *  <li>importeFinal es el precio final del proyecto.</li>
 *  <li>horasEstimadas son las horas que se estima que se tardara en hacer el proyecto.</li>
 *  <li>horasFinales son las horas que se a tardad oe nahcer el proyecto.</li>
 *  <li>cliente son todos los datos del cliente</li>
 *  <li>servicios es la coleccion de servicos y los datos correspondientes de cada servicio que tiene el proyecto </li>
 * </ul>
 * 
 * 
 * @author Iker Jon Mediavilla
 */
@Entity
public class Proyecto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date fechaEstimada;
    private Date fechaFinal;
    private String concepto;
    private Float importeEstimado;
    private Float importeFinal;
    private Integer horasEstimadas;
    private Integer horasFinales;
    @ManyToOne
    private Cliente cliente;
    @ManyToMany(mappedBy="Proyectos")
    private Collection<Servicio> servicios;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaEstimada() {
        return fechaEstimada;
    }

    public void setFechaEstimada(Date fechaEstimada) {
        this.fechaEstimada = fechaEstimada;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Float getImporteEstimado() {
        return importeEstimado;
    }

    public void setImporteEstimado(Float importeEstimado) {
        this.importeEstimado = importeEstimado;
    }

    public Float getImporteFinal() {
        return importeFinal;
    }

    public void setImporteFinal(Float importeFinal) {
        this.importeFinal = importeFinal;
    }

    public Integer getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(Integer horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public Integer getHorasFinales() {
        return horasFinales;
    }

    public void setHorasFinales(Integer horasFinales) {
        this.horasFinales = horasFinales;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Collection<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(Collection<Servicio> servicios) {
        this.servicios = servicios;
    }

   
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proyecto)) {
            return false;
        }
        Proyecto other = (Proyecto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javafxServerSite.Entity.Proyecto[ id=" + id + " ]";
    }
    
}
