package com.portfolio.luisfmdc.sboot_teacher_ms.domain;

import jakarta.validation.constraints.NotBlank;

public record InstrutorRequest(@NotBlank String nome, @NotBlank String sobrenome, @NotBlank String email) {
}
