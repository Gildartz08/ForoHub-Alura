package com.alura_forohub.application.model.topico;

import java.time.LocalDateTime;

public record DtoResponseTopico(
        Long id,
        String titulo,
        String mensaje,
//        LocalDateTime fechaCreacion,
        String autor,
        String curso) {
}
