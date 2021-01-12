package com.prueba.soaint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.soaint.models.entity.Venta;
import com.prueba.soaint.models.services.VentaService;

@RestController
@RequestMapping("/api/v1.0")
public class VentaController {
	
	@Autowired
	private VentaService ventaService;
	
	@GetMapping("/ventas")
	public List<Venta> index(){
		return ventaService.findAll();
	}
	
	@PostMapping("ventas")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Venta create(@RequestBody Venta venta){
		return ventaService.save(venta);
	}

}
