package com.studies.store.controllers;

import com.studies.store.dtos.requests.ProductRequestDTO;
import com.studies.store.dtos.responses.ProductResponseDTO;
import com.studies.store.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @PostMapping
    public ResponseEntity<ProductResponseDTO> createProduct(@RequestBody ProductRequestDTO dto){
        ProductResponseDTO response = service.criarProduto(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<ProductResponseDTO>> getAllProducts(){
        List<ProductResponseDTO> response = service.findAll();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponseDTO> getProductById(@PathVariable UUID id){
        ProductResponseDTO response = service.buscarPorId(id);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductResponseDTO> updateProduct(@PathVariable UUID id, @RequestBody ProductRequestDTO dto){
        ProductResponseDTO response = service.atualizarPorId(id, dto);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable UUID id){
        service.deletarPorId(id);
        return ResponseEntity.noContent().build();
    }
}
