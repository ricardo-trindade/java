package com.studies.tasks.controllers;

import com.studies.tasks.dtos.requests.TaskRequestDTO;
import com.studies.tasks.dtos.responses.TaskResponseDTO;
import com.studies.tasks.services.TaskService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService service;

    @PostMapping
    public ResponseEntity<TaskResponseDTO> createTask(@RequestBody @Valid TaskRequestDTO dto) {
        TaskResponseDTO response = service.createTask(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity <List<TaskResponseDTO>> findAll() {
        List<TaskResponseDTO> response = service.findAll();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{title}")
    public ResponseEntity<TaskResponseDTO> findByTitle(@PathVariable String title) {
        TaskResponseDTO response = service.findByTitulo(title);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaskResponseDTO> updateTask(@PathVariable Long id, @RequestBody @Valid TaskRequestDTO dto) {
        TaskResponseDTO response = service.updateTask(id, dto);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        service.deleteTask(id);
        return ResponseEntity.noContent().build();
    }
}

