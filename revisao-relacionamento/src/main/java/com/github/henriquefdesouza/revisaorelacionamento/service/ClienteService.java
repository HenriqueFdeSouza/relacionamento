package com.github.henriquefdesouza.revisaorelacionamento.service;

import com.github.henriquefdesouza.revisaorelacionamento.controller.dto.ClienteRequestDto;
import com.github.henriquefdesouza.revisaorelacionamento.controller.dto.ClienteResponseDto;
import com.github.henriquefdesouza.revisaorelacionamento.model.Automovel;
import com.github.henriquefdesouza.revisaorelacionamento.model.Cliente;
import com.github.henriquefdesouza.revisaorelacionamento.repository.ClienteRepositorio;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private ClienteRepositorio clienteRepositorio;

    public ClienteService(ClienteRepositorio clienteRepositorio) {
        this.clienteRepositorio = clienteRepositorio;
    }

    public ClienteResponseDto save(ClienteRequestDto clienteRequestDto) {
//        List<Automovel> automovelList = new ArrayList<>();
//        Automovel automovelId = automovelService.findById(clienteRequestDto.carroId());
//        if (automovelId != null) {
//            automovelList.add(automovelId);
//        }
        return ClienteResponseDto.fromEntity(clienteRepositorio.save(clienteRequestDto.toEntity()));
    }

    public Cliente findById(Long id) {
        return clienteRepositorio.findById(id).orElseThrow(RuntimeException::new);
    }

}
