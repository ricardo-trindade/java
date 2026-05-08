package com.studies.news.repositories;

import com.studies.news.entities.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NewsRepository extends JpaRepository<News, Long> {

    public List<News> findByCategoria(String categoria);
    public News findByTitulo(String titulo);
    public List<News> findByAutor(String autor);
}
