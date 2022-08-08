package com.idat.springbootapirestventas.app.service;
import java.util.List;

import com.idat.springbootapirestventas.app.entity.Producto;




public interface IProductoService {
		public List<Producto> listarProducto();
		public Producto  crearProducto(Producto  producto);
		public Producto  editarProducto(Long id);
		public void eliminarProducto (Long id);
}
