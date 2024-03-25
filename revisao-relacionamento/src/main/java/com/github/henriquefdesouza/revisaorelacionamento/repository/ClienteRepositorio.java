package com.github.henriquefdesouza.revisaorelacionamento.repository;

import com.github.henriquefdesouza.revisaorelacionamento.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {
}
