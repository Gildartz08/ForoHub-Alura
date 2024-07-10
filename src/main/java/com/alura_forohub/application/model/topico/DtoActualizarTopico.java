package com.alura_forohub.application.model.topico;

import com.alura_forohub.application.model.Curso;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DtoActualizarTopico(
//        @NotNull
//        Long id,
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        String autor,
        @NotBlank
        String curso){
}
