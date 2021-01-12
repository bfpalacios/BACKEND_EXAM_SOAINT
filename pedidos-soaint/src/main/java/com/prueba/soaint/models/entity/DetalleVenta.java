package com.prueba.soaint.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="detalle_ventas")
public class DetalleVenta implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDetalleVenta;
	
	@ManyToOne
	@JoinColumn(name = "idVenta", nullable = false )
	private Venta venta;
	
	@ManyToOne
	@JoinColumn(name = "idProducto", nullable = false )
	private Producto producto;
	
	

	public Long getIdDetalleVenta() {
		return idDetalleVenta;
	}
	public void setIdDetalleVenta(Long idDetalleVenta) {
		this.idDetalleVenta = idDetalleVenta;
	}
	public Venta getVenta() {
		return venta;
	}
	public void setVenta(Venta venta) {
		this.venta = venta;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
