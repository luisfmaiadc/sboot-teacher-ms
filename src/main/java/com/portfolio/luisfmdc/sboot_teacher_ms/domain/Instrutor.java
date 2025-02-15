package com.portfolio.luisfmdc.sboot_teacher_ms.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table
public class Instrutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String sobrenome;
    private String email;
    private LocalDateTime dataCadastro = LocalDateTime.now();
    private Boolean ativo = Boolean.TRUE;

    public Instrutor(InstrutorRequest request) {
        this.nome = request.nome();
        this.sobrenome = request.sobrenome();
        this.email = request.email();
    }

    public void atualizarInstrutor(UpdateInstrutorRequest request) {

        if (request.nome() != null && !request.nome().isEmpty()) {
            this.nome = request.nome();
        }

        if (request.sobrenome() != null && !request.sobrenome().isEmpty()) {
            this.sobrenome = request.sobrenome();
        }

        if (request.email() != null && !request.email().isEmpty()) {
            this.email = request.email();
        }

        if (request.ativo() != null && request.ativo().booleanValue() == Boolean.TRUE) {
            this.ativo = true;
        }
    }
}
