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
@Table(name = "facturas")
public class FacturaModel {
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
	
	public FacturaModel() {
		// TODO Auto-generated constructor stub
	}
	
	


	public FacturaModel(ClienteModel cliente, String fecha) {
		super();
		this.cliente = cliente;
		this.fecha = fecha;
	}




	//id_clientes
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "id_cliente")
	private ClienteModel cliente;

	private String fecha;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public ClienteModel getCliente() {
		return cliente;
	}

	public void setCliente(ClienteModel cliente) {
		this.cliente = cliente;
	}





}
