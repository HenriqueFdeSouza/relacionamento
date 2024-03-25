package com.github.henriquefdesouza.revisaorelacionamento.controller.dto;

import com.github.henriquefdesouza.revisaorelacionamento.model.Automovel;
import com.github.henriquefdesouza.revisaorelacionamento.model.Cliente;

import java.util.List;

public record ClienteResponseDto(Long id, String name, int age) {

    public static ClienteResponseDto fromEntity(Cliente cliente) {

        return new ClienteResponseDto(cliente.getId(), cliente.getName(), cliente.getAge());
    }
}
