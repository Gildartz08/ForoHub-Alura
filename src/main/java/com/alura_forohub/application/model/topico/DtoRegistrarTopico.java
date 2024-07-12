package com.alura_forohub.application.model.topico;


import jakarta.validation.constraints.NotBlank;


public record DtoRegistrarTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        String autor,
        @NotBlank
        String curso){
}
