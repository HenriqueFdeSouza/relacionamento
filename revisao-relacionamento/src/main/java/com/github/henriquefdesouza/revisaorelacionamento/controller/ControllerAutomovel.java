package com.github.henriquefdesouza.revisaorelacionamento.controller;

import com.github.henriquefdesouza.revisaorelacionamento.controller.dto.AutomovelRequestDto;
import com.github.henriquefdesouza.revisaorelacionamento.controller.dto.AutomovelResponseDto;
import com.github.henriquefdesouza.revisaorelacionamento.service.AutomovelService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/automovel")
public class ControllerAutomovel {

    private AutomovelService automovelService;

    public ControllerAutomovel(AutomovelService automovelService) {
        this.automovelService = automovelService;
    }

    @PostMapping("/save")
    public AutomovelResponseDto save(@RequestBody AutomovelRequestDto automovelRequestDto) {
        return automovelService.save(automovelRequestDto);
    }
}
