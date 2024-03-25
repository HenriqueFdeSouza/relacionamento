package com.github.henriquefdesouza.revisaorelacionamento.controller.dto;

import com.github.henriquefdesouza.revisaorelacionamento.model.Automovel;
import com.github.henriquefdesouza.revisaorelacionamento.model.Cliente;

import java.util.List;

public record ClienteRequestDto(String name, int age) {

    public Cliente toEntity() {
        return new Cliente(name, age);
    }
}
