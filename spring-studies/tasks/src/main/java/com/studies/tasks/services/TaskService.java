package com.studies.tasks.services;

import com.studies.tasks.dtos.requests.TaskRequestDTO;
import com.studies.tasks.dtos.responses.TaskResponseDTO;
import com.studies.tasks.entities.TaskEntity;
import com.studies.tasks.repositories.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository repository;

    @Transactional(readOnly = true)
    public List<TaskResponseDTO> findAll() {
        return repository.findAll().stream()
                .map(e -> new TaskResponseDTO(
                        e.getTitulo(),
                        e.getDescricao(),
                        e.getConcluida(),
                        e.getDataCriacao()
                ))
                .toList();
    }

    @Transactional
    public TaskResponseDTO createTask(TaskRequestDTO dto) {
        TaskEntity entity = new TaskEntity();
        entity.setTitulo(dto.titulo());
        entity.setDescricao(dto.descricao());

        entity.setConcluida(false);
        entity.setDataCriacao(LocalDate.now());

        repository.save(entity);

        return new TaskResponseDTO(
                entity.getTitulo(),
                entity.getDescricao(),
                entity.getConcluida(),
                entity.getDataCriacao()
        );
    }

    @Transactional
    public TaskResponseDTO findByTitulo(String titulo) {
        TaskEntity entity = repository.findByTitulo(titulo);
        return new TaskResponseDTO(
                entity.getTitulo(),
                entity.getDescricao(),
                entity.getConcluida(),
                entity.getDataCriacao()
        );
    }

    @Transactional
    public TaskResponseDTO updateTask(Long id, TaskRequestDTO dto) {
        TaskEntity entity = repository.findById(id).orElseThrow(() -> new RuntimeException("Tarefa não encontrada com o ID: " + id));

        entity.setTitulo(dto.titulo());
        entity.setDescricao(dto.descricao());

        return new TaskResponseDTO(
                entity.getTitulo(),
                entity.getDescricao(),
                entity.getConcluida(),
                entity.getDataCriacao()
        );
    }

    @Transactional
    public void deleteTask(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Não é possível deletar. Livro não encontrado.");
        }
        repository.deleteById(id);
    }


}
