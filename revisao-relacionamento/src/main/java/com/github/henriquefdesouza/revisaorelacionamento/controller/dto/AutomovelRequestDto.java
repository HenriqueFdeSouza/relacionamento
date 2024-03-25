package com.github.henriquefdesouza.revisaorelacionamento.controller.dto;

import com.github.henriquefdesouza.revisaorelacionamento.model.Automovel;
import com.github.henriquefdesouza.revisaorelacionamento.model.Cliente;

public record AutomovelRequestDto(String modelo, int yearOfManufacture, Long clientId) {

    public Automovel toEntity(Cliente cliente) {
        return new Automovel(modelo, yearOfManufacture, cliente);
    }
}
