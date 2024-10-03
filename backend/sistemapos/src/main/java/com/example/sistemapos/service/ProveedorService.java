package com.example.sistemapos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sistemapos.model.Proveedor;
import com.example.sistemapos.repository.ProveedorRepository;

@Service
public class ProveedorService {
    @Autowired
    private ProveedorRepository proveedorRepository;

    public List<Proveedor> findProveedores(){
        return proveedorRepository.findAll();
    }

}
