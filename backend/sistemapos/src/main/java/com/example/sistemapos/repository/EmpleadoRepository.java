package com.example.sistemapos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.sistemapos.model.Empleado;

public interface EmpleadoRepository extends JpaRepository <Empleado, Integer> {

    @Query("SELECT e FROM Empleado e WHERE e.activo = true")
    List<Empleado> findActiveEmpleados();

}
