package com.prueba.soaint.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.soaint.models.dao.VentaDAO;
import com.prueba.soaint.models.entity.Venta;

@Service
public class VentaServiceImpl implements VentaService{

	@Autowired
	private VentaDAO ventaDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Venta> findAll() {

		return ventaDao.findAll();
	}

	@Override
	public Venta save(Venta venta) {

		return ventaDao.save(venta);
	}

}
