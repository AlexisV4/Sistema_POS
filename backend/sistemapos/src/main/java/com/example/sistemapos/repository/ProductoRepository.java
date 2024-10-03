package com.example.sistemapos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.sistemapos.model.Producto;

public interface ProductoRepository extends JpaRepository <Producto, Integer>{

    @Query("SELECT p FROM Producto p WHERE p.activo = true")
    List<Producto> findActiveProductos();

}
