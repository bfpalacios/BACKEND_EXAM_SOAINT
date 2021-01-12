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

import com.prueba.soaint.models.MensajeResponse;
import com.prueba.soaint.models.entity.Cliente;
import com.prueba.soaint.models.services.ClienteService;

@RestController
@RequestMapping("/api/v1.0")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/clientes")
	public List<Cliente> index(){
		return clienteService.findAll();
	}
	
	@PostMapping("clientes")
	@ResponseStatus(code = HttpStatus.CREATED)
	public MensajeResponse create(@RequestBody Cliente cliente){
		return clienteService.save(cliente);
		
	}
}
