package com.github.henriquefdesouza.revisaorelacionamento.controller;

import com.github.henriquefdesouza.revisaorelacionamento.controller.dto.ClienteRequestDto;
import com.github.henriquefdesouza.revisaorelacionamento.controller.dto.ClienteResponseDto;
import com.github.henriquefdesouza.revisaorelacionamento.service.ClienteService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ControllerCliente {


    private ClienteService clienteService;


    public ControllerCliente(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping("/save")
    public ClienteResponseDto save(@RequestBody ClienteRequestDto clienteRequestDto) {
        return clienteService.save(clienteRequestDto);
    }

    @PutMapping("/update_client")
    public ClienteResponseDto updateClient(@RequestBody ClienteRequestDto clienteRequestDto) {
        return clienteService.save(clienteRequestDto);
    }


}
