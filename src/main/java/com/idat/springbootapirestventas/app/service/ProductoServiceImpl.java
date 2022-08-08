package com.idat.springbootapirestventas.app.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.idat.springbootapirestventas.app.dao.IProductoDao;
import com.idat.springbootapirestventas.app.entity.Producto;



@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoDao clienteDao;
	

	@Override
	@Transactional 
	public Producto crearProducto(Producto producto) {	
			return clienteDao.save(producto);
	}



	@Override
	@Transactional
	public List<Producto> listarProducto() {
		return (List<Producto>) clienteDao.findAll();
	}


	@Override
	@Transactional
	public void eliminarProducto(Long id) {
		clienteDao.deleteById(id);
	}


	@Override
	@Transactional
	public Producto  editarProducto(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.findById(id).orElse(null);
	}


}
