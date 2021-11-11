package com.jatroconis.springboot.web.app.data;

import com.jatroconis.springboot.web.app.models.ClienteModel;
import com.jatroconis.springboot.web.app.models.DetalleModel;
import com.jatroconis.springboot.web.app.models.FacturaModel;
import com.jatroconis.springboot.web.app.models.ProductoModel;

public class FacturaData {


	public ProductoModel getProducto() {
		return producto;
	}

	public void setProducto(ProductoModel producto) {
		this.producto = producto;
	}

	public DetalleModel getDetalle() {
		return detalle;
	}

	public void setDetalle(DetalleModel detalle) {
		this.detalle = detalle;
	}

	private int idClient; 
	
	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	private ProductoModel producto;
	
	private DetalleModel detalle;
	
	private FacturaModel factura;

	public FacturaModel getFactura() {
		return factura;
	}

	public void setFactura(FacturaModel factura) {
		this.factura = factura;
	}
	

	

	
	
	
}
