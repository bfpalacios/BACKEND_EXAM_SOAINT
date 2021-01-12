package com.prueba.soaint.models.services;

import java.util.List;

import com.prueba.soaint.models.entity.Venta;

public interface VentaService {

	public List<Venta> findAll();
	
	public Venta save(Venta venta);
	
}
