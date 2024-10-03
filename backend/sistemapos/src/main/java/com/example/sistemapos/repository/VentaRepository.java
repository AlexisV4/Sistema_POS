package com.example.sistemapos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sistemapos.model.Venta;

public interface VentaRepository extends JpaRepository <Venta, Integer> {

}
