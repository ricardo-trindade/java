package com.studies.account.controllers;

import com.studies.account.dtos.requests.UserRequestDTO;
import com.studies.account.dtos.responses.UserResponseDTO;
import com.studies.account.services.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping
    public ResponseEntity<UserResponseDTO> cadastro(@RequestBody @Valid UserRequestDTO dto) {
        UserResponseDTO response = service.cadastro(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<UserResponseDTO>> listar() {
        List<UserResponseDTO> response = service.findAll();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{nome}")
    public ResponseEntity<UserResponseDTO> getByNome(@PathVariable String nome) {
        UserResponseDTO response = service.findByNome(nome);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{nome}")
    public ResponseEntity<UserResponseDTO> atualizar(@PathVariable String nome, @RequestBody UserRequestDTO dto) {
        UserResponseDTO response = service.atualizar(nome, dto);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{nome}")
    public ResponseEntity<Void> deleteByNome(@PathVariable String nome) {
        service.deleteByNome(nome);
        return ResponseEntity.noContent().build();
    }
}
