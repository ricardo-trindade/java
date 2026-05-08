package com.studies.news.services;

import com.studies.news.dtos.requests.NewsRequestDTO;
import com.studies.news.dtos.responses.NewsResponseDTO;
import com.studies.news.entities.News;
import com.studies.news.repositories.NewsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NewsService {

    private final NewsRepository repository;

    @Transactional
    public NewsResponseDTO criarNoticia(NewsRequestDTO dto) {
        News news = new News();

        news.setTitulo(dto.titulo());
        news.setSubtitulo(dto.subtitulo());
        news.setConteudo(dto.conteudo());
        news.setAutor(dto.autor());
        news.setCategoria(dto.categoria());

        news.setDataHora(LocalDateTime.now());

        repository.save(news);

        return new NewsResponseDTO(
                news.getTitulo(),
                news.getSubtitulo(),
                news.getConteudo(),
                news.getAutor(),
                news.getCategoria(),
                news.getDataHora()
        );
    }

    @Transactional(readOnly = true)
    public List<NewsResponseDTO> listarTodas() {
        return repository.findAll().stream()
                .map(NewsResponseDTO::new)
                .toList();
    }

    @Transactional(readOnly = true)
    public NewsResponseDTO buscarPorTitulo(String titulo){
        News news = repository.findByTitulo(titulo);
        return new NewsResponseDTO(
                news.getTitulo(),
                news.getSubtitulo(),
                news.getConteudo(),
                news.getAutor(),
                news.getCategoria(),
                news.getDataHora()
        );
    }

    @Transactional(readOnly = true)
    public List<NewsResponseDTO> listarPorCategoria(String categoria){
        return repository.findByCategoria(categoria).stream()
                .map(NewsResponseDTO::new)
                .toList();
    }

    @Transactional(readOnly = true)
    public List<NewsResponseDTO> listarPorAutor(String autor){
        return repository.findByAutor(autor).stream()
                .map(NewsResponseDTO::new)
                .toList();
    }

    @Transactional
    public NewsResponseDTO atualizarNoticia(Long id, NewsRequestDTO dto) {
        News news = repository.findById(id).orElseThrow(() -> new RuntimeException("Notícia não encontrada"));

        news.setTitulo(dto.titulo());
        news.setSubtitulo(dto.subtitulo());
        news.setConteudo(dto.conteudo());
        news.setAutor(dto.autor());
        news.setCategoria(dto.categoria());

        repository.save(news);

        return new NewsResponseDTO(
                news.getTitulo(),
                news.getSubtitulo(),
                news.getConteudo(),
                news.getAutor(),
                news.getCategoria(),
                news.getDataHora()
        );
    }

    @Transactional
    public void deletarNoticia(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Notícia não encontrada");
        }

        repository.deleteById(id);
    }
}
