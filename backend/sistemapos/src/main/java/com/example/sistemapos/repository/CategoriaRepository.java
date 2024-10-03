package com.example.sistemapos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sistemapos.model.Categoria;

public interface CategoriaRepository extends JpaRepository <Categoria, Integer> {

}
