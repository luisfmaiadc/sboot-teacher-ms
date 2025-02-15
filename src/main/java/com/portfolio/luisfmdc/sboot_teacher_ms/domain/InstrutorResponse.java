package com.portfolio.luisfmdc.sboot_teacher_ms.domain;

import jakarta.validation.constraints.NotBlank;

public record InstrutorResponse(@NotBlank String nome, @NotBlank String sobrenome, @NotBlank String email) {

    public InstrutorResponse(Instrutor instrutor) {
        this(instrutor.getNome(), instrutor.getSobrenome(), instrutor.getEmail());
    }
}
