package com.prueba.soaint.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.soaint.models.MensajeResponse;
import com.prueba.soaint.models.dao.ClienteDAO;
import com.prueba.soaint.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteDAO clienteDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	public MensajeResponse save(Cliente cliente) {
		
		MensajeResponse mensajeResponse = new MensajeResponse();

		
		mensajeResponse.setCodigoRespuesta("0");
		mensajeResponse.setMensajeRespuesta("RESULTADO EXITOSO "); 
		
		try {
			clienteDao.save(cliente);
		} catch (Exception e) {
			mensajeResponse.setCodigoRespuesta("-1");
			mensajeResponse.setMensajeRespuesta("ERROR INESPERADO"); 
		}  
		
		return  mensajeResponse;
	}
	

}
