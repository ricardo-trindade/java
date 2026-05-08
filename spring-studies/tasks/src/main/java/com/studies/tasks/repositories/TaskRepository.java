package com.studies.tasks.repositories;

import com.studies.tasks.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {

    public TaskEntity findByTitulo(String titulo);
}
