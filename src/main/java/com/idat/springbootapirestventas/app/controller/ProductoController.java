package com.idat.springbootapirestventas.app.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.springbootapirestventas.app.entity.Producto;
import com.idat.springbootapirestventas.app.service.IProductoService;


@CrossOrigin()
@RestController
public class ProductoController {

	@Autowired
	private IProductoService productoDao;
	@GetMapping("/")
	public List<Producto> index(){
		return productoDao.listarProducto();
	}
	
	
}
