package com.studies.news.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "news")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String titulo;
    @Column(nullable = false)
    private String subtitulo;
    @Column(nullable = false)
    private String conteudo;
    @Column(nullable = false)
    private String autor;
    @Column(nullable = false)
    private String categoria;

    @NotNull
    private LocalDateTime dataHora;

}
