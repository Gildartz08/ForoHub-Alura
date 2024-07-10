package com.alura_forohub.application.model.usuario;

public record DtoRegistrarUsuario(
        String nombreUsuario,
        String login,
        String password
) {
}
