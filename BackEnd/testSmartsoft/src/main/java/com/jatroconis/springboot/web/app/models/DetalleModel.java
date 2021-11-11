package com.jatroconis.springboot.web.app.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detalles")
public class DetalleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;


	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "id_producto")
    private ProductoModel producto;
    
    
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "id_factura")
    private FacturaModel factura;

    
    private Integer cantidad;

    private Double precio;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

	public FacturaModel getFactura() {
		return factura;
	}

	public void setFactura(FacturaModel factura) {
		this.factura = factura;
	}

	public ProductoModel getProducto() {
		return producto;
	}

	public void setProducto(ProductoModel producto) {
		this.producto = producto;
	}


}
