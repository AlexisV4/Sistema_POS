package com.example.sistemapos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente {
    @Id
    private int id_cliente;
    private String nombre;
    private String telefono;

    public Cliente() {
    }

    public Cliente(int id_cliente, String nombre, String telefono) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.telefono = telefono;
    }


    public int getId_cliente() {
        return this.id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
