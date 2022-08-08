package com.idat.springbootapirestventas.app.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.idat.springbootapirestventas.app.entity.Producto;


public interface IProductoDao extends CrudRepository<Producto,Long> {

}
