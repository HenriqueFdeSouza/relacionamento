package com.github.henriquefdesouza.revisaorelacionamento.service;

import com.github.henriquefdesouza.revisaorelacionamento.controller.dto.AutomovelRequestDto;
import com.github.henriquefdesouza.revisaorelacionamento.controller.dto.AutomovelResponseDto;
import com.github.henriquefdesouza.revisaorelacionamento.model.Automovel;
import com.github.henriquefdesouza.revisaorelacionamento.model.Cliente;
import com.github.henriquefdesouza.revisaorelacionamento.repository.AutomovelRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutomovelService {

    private AutomovelRepository automovelRepository;
    private ClienteService clienteService;

    public AutomovelService(AutomovelRepository automovelRepository, ClienteService clienteService) {
        this.automovelRepository = automovelRepository;
        this.clienteService = clienteService;
    }

    public AutomovelResponseDto save(AutomovelRequestDto automovelRequestDto) {
        List<Cliente> clienteList = new ArrayList<>();
        Cliente cliente = clienteService.findById(automovelRequestDto.clientId());
        if (cliente != null) {
            clienteList.add(cliente);
        }
        return AutomovelResponseDto.fromEntity(automovelRepository.save(automovelRequestDto.toEntity(cliente)));
    }

    public Automovel findById(Long id) {
        return automovelRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
