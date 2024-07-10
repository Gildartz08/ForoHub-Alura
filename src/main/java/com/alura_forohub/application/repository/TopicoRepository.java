package com.alura_forohub.application.repository;

import com.alura_forohub.application.model.topico.Topico;
import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.Optional;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

}
