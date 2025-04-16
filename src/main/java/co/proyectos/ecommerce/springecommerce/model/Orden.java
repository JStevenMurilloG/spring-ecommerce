package co.proyectos.ecommerce.springecommerce.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name= "Ordenes")
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOrden;
    private String numero;
    private Date fechaCreacion;
    private Date fechaRecibido;

    private double totalOrden;

    @ManyToOne
    private Usuario usuario;

    @OneToOne(mappedBy="orden")
    private DetalleOrden detalleOrden;


    public Orden() {
    }

    public Orden(Integer idOrden, String numero, Date fechaCreacion, Date fechaRecibido, double totalOrden) {
        this.idOrden = idOrden;
        this.numero = numero;
        this.fechaCreacion = fechaCreacion;
        this.fechaRecibido = fechaRecibido;
        this.totalOrden = totalOrden;
    }

    public Integer getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Integer idOrden) {
        this.idOrden = idOrden;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaRecibido() {
        return fechaRecibido;
    }

    public void setFechaRecibido(Date fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    public double getTotalOrden() {
        return totalOrden;
    }

    public void setTotalOrden(double totalOrden) {
        this.totalOrden = totalOrden;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Orden{" +
                "idOrden=" + idOrden +
                ", numero='" + numero + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaRecibido=" + fechaRecibido +
                ", totalOrden=" + totalOrden +
                '}';
    }

    public DetalleOrden getDetalleOrden() {
        return detalleOrden;
    }

    public void setDetalleOrden(DetalleOrden detalleOrden) {
        this.detalleOrden = detalleOrden;
    }
}
