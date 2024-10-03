package com.example.sistemapos.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.sistemapos.model.Venta;

import com.example.sistemapos.repository.VentaRepository;

@Service
public class VentaService {
    @Autowired
    private VentaRepository ventaRepository;

    public List<Venta> findAllVentas(){
        return ventaRepository.findAll();
    }

}
