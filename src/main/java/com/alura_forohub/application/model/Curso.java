package com.alura_forohub.application.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Curso {
    private Long id;
    private String nombreCurso;
    private Categoria categoria;
}
