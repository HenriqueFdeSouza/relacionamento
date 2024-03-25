package com.github.henriquefdesouza.revisaorelacionamento.controller.dto;

import com.github.henriquefdesouza.revisaorelacionamento.model.Automovel;
import com.github.henriquefdesouza.revisaorelacionamento.model.Cliente;

public record AutomovelResponseDto(Long id, String modelo, int yearOfManufacture, Cliente cliente) {

    public static AutomovelResponseDto fromEntity(Automovel automovel) {
        return new AutomovelResponseDto(automovel.getId(), automovel.getModelo(), automovel.getYearOfManufacture(), automovel.getClientes());
    }
}
