package com.alura_forohub.application.controller;

import com.alura_forohub.application.model.topico.*;
import com.alura_forohub.application.repository.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public ResponseEntity<DtoResponseTopico> registrarTopico(@RequestBody @Valid DtoRegistrarTopico dtoRegistrarTopico,
                                                             UriComponentsBuilder uriComponentsBuilder) {
        Topico topico = topicoRepository.save(new Topico(dtoRegistrarTopico));
        DtoResponseTopico dtoResponseTopico = new DtoResponseTopico(topico.getId(), topico.getTitulo(), topico.getMensaje(),
                topico.getAutor(), topico.getCurso());
        URI url = uriComponentsBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
        return ResponseEntity.created(url).body(dtoResponseTopico);
    }

    @GetMapping
    public List<DtoListarTopicos> listarTopicos() {
        return topicoRepository.findAll().stream().map(DtoListarTopicos::new).toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DtoListarTopicos> muestraTopico(@PathVariable Long id){
        Topico topico = topicoRepository.getReferenceById(id);
        var datosTopico =new DtoListarTopicos(topico);
        return ResponseEntity.ok(datosTopico);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity actualizaTopico(@RequestBody @Valid DtoActualizarTopico dtoActualizarTopico, @PathVariable Long id){
        Topico topico = topicoRepository.getReferenceById(id);
        var nuevosDatos = topico.actualizarDatos(dtoActualizarTopico);
        return ResponseEntity.ok(nuevosDatos);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void eliminarTopico(@PathVariable Long id){
        Topico topico = topicoRepository.getReferenceById(id);
        topicoRepository.delete(topico);
    }

}
