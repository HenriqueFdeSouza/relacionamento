package com.github.henriquefdesouza.revisaorelacionamento.model;

import jakarta.persistence.*;

@Entity
public class Automovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    private int yearOfManufacture;

    @ManyToOne
    @JoinColumn(name = "clientes_id")
    private Cliente clientes;

    public Automovel(String modelo, int yearOfManufacture, Cliente clientes) {
        this.modelo = modelo;
        this.yearOfManufacture = yearOfManufacture;
        this.clientes = clientes;
    }

    @Deprecated
    public Automovel() {
    }

    public Cliente getClientes() {
        return clientes;
    }

    public Long getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Automovel{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
