package com.github.henriquefdesouza.revisaorelacionamento.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;

    @OneToMany(mappedBy = "clientes")
    private List<Automovel> automovels;

    public Cliente(String name, int age, List<Automovel> automovels) {
        this.name = name;
        this.age = age;
        this.automovels = automovels;
    }

    public Cliente(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cliente() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Automovel> getAutomovels() {
        return automovels;
    }


}
