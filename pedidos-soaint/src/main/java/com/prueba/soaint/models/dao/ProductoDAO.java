package com.prueba.soaint.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.soaint.models.entity.Producto;

public interface ProductoDAO extends JpaRepository<Producto, Long>{

}
