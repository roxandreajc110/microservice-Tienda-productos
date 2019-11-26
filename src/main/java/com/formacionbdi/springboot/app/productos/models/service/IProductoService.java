package com.formacionbdi.springboot.app.productos.models.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.formacionbdi.springboot.app.productos.models.entity.Producto;


public interface IProductoService {

	public List<Producto> findAll();
	
	public Producto findById(Long id);
}
