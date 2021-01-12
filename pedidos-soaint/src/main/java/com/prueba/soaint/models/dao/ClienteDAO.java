package com.prueba.soaint.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.soaint.models.entity.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Long> {

}
