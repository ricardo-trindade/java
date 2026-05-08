package com.studies.news.dtos.responses;

import com.studies.news.entities.News;

import java.time.LocalDateTime;

public record NewsResponseDTO(
        String titulo,
        String subtitulo,
        String conteudo,
        String autor,
        String categoria,
        LocalDateTime dataHora
) {

    public NewsResponseDTO(News news) {
        this(
                news.getTitulo(),
                news.getSubtitulo(),
                news.getConteudo(),
                news.getAutor(),
                news.getCategoria(),
                news.getDataHora()
        );
    }
}
