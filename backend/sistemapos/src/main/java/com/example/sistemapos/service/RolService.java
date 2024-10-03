package com.example.sistemapos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sistemapos.model.Rol;
import com.example.sistemapos.repository.RolRepository;

@Service
public class RolService {
    @Autowired
    private RolRepository rolRepository;

    public List<Rol> findAllRoles(){
        return rolRepository.findAll();
    }

}
