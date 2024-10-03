package com.example.sistemapos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sistemapos.model.Producto;
import com.example.sistemapos.repository.ProductoRepository;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> findActiveProductos(){
        return productoRepository.findActiveProductos();
    }

    public Producto getProductoById(int id){
        return productoRepository.findById(id).orElse(null);
    }

    public Producto saveProducto(Producto producto){
        return productoRepository.save(producto);
    }

    public Producto updateProducto(Producto producto){
        return productoRepository.save(producto);
    }

    public void inactivarProducto(int id){
        Producto producto = productoRepository.findById(id).orElse(null);
        if(producto != null){
            producto.setActivo(false);
            productoRepository.save(producto);
        }
    }


}
