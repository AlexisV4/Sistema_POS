package com.example.sistemapos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.sistemapos.model.Empleado;
import com.example.sistemapos.repository.EmpleadoRepository;

@Service
public class EmpleadoService {
    @Autowired
    private EmpleadoRepository empleadoRepository;

    // Instancia de BCryptPasswordEncoder para encriptar contraseñas
    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public List<Empleado> findActiveEmpleados(){
        return empleadoRepository.findActiveEmpleados();
    }
    
    // Guardar un empleado con contraseña encriptada
    public Empleado saveEmpleado(Empleado empleado){
        // Encriptar la contraseña antes de guardar
        String encodedPassword = passwordEncoder.encode(empleado.getContrasena());
        empleado.setContrasena(encodedPassword);
        return empleadoRepository.save(empleado);
    }



}
