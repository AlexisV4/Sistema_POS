package com.example.sistemapos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sistemapos.model.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Integer> {

}