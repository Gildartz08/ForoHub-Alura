package com.alura_forohub.application.model.topico;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaCreacion;
    private Boolean status;
    private String autor;
    private String curso;
    private Integer respuestas;

    public Topico(DtoRegistrarTopico dtoRegistrarTopico) {
        this.titulo = dtoRegistrarTopico.titulo();
        this.mensaje = dtoRegistrarTopico.mensaje();
        this.status = true;
        this.autor = dtoRegistrarTopico.autor();
        this.curso = dtoRegistrarTopico.curso();
        this.fechaCreacion = LocalDateTime.now();
        this.respuestas = 0;
    }

    public DtoResponseTopico actualizarDatos (DtoActualizarTopico dtoActualizarTopico) {
        if (dtoActualizarTopico.titulo() != null) {
            this.titulo = dtoActualizarTopico.titulo();
        }
        if (dtoActualizarTopico.mensaje() != null) {
            this.mensaje = dtoActualizarTopico.mensaje();
        }
        if (dtoActualizarTopico.autor() != null) {
            this.autor = dtoActualizarTopico.autor();
        }
        if (dtoActualizarTopico.curso() != null) {
            this.curso = dtoActualizarTopico.curso();
        }
        return new DtoResponseTopico(this.id, this.titulo, this.mensaje, this.autor, this.curso);
    }
}
