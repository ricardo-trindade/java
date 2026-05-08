package com.studies.news.controllers;

import com.studies.news.dtos.requests.NewsRequestDTO;
import com.studies.news.dtos.responses.NewsResponseDTO;
import com.studies.news.entities.News;
import com.studies.news.services.NewsService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
@RequiredArgsConstructor
public class NewsController {

    public final NewsService service;

    @PostMapping
    public ResponseEntity criarNoticia(@RequestBody @Valid NewsRequestDTO dto){
        NewsResponseDTO response = service.criarNoticia(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<NewsResponseDTO>> findAll(){
        List<NewsResponseDTO> response = service.listarTodas();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{titulo}")
    public ResponseEntity buscarPorTitulo(@PathVariable String titulo){
        NewsResponseDTO response = service.buscarPorTitulo(titulo);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/categoria/{categoria}")
    public ResponseEntity<List<NewsResponseDTO>> listarPorCategoria(@PathVariable String categoria){
        List<NewsResponseDTO> response = service.listarPorCategoria(categoria);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/autor/{autor}")
    public ResponseEntity<List<NewsResponseDTO>> listarPorAutor(@PathVariable String autor){
        List<NewsResponseDTO> response = service.listarPorAutor(autor);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity atualizar(@PathVariable Long id, @RequestBody NewsRequestDTO dto){
        NewsResponseDTO response = service.atualizarNoticia(id, dto);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarNoticia(@PathVariable Long id){
        service.deletarNoticia(id);
        return ResponseEntity.noContent().build();
    }
}
