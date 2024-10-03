package com.example.sistemapos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sistemapos.model.Categoria;
import com.example.sistemapos.repository.CategoriaRepository;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> findCategorias(){
        return categoriaRepository.findAll();
    }

}
