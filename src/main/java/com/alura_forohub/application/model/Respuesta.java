package com.alura_forohub.application.model;

import com.alura_forohub.application.model.topico.Topico;
import com.alura_forohub.application.model.usuario.Usuario;

import java.time.LocalDateTime;

public class Respuesta {
    private Long id;
    private String mensaje;
    private Topico topico;
    private LocalDateTime fechaCreacion;
    private Usuario autor;
    private String solucion;

}
