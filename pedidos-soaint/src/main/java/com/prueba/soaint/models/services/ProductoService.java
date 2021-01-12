package com.prueba.soaint.models.services;

import java.util.List;

import com.prueba.soaint.models.MensajeResponse;
import com.prueba.soaint.models.entity.Producto;

public interface ProductoService {

	public List<Producto> findAll();
	
	public MensajeResponse save(Producto producto);
	
	public void delete(Long id);

	public Producto findById(Long id);
}
