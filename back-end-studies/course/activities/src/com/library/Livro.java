package com.library;

public class Livro implements Imprestavel {

    // Attributes
    protected int isbn;
    protected String titulo;
    protected String autor;
    protected String status;

    // Constructor
    public Livro(int isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.status = "Disponível";
    }

    // Methods
    @Override
    public void emprestar(Usuario u) {
        if ("DISPONÍVEL".equals(status)) {
            status = "EMPRESTADO";
        } else {
            System.out.println("Livro já emprestado.");
        }
    }

    @Override
    public void devolver() {
        status = "DISPONÍVEL";
    }

    // Getters and Setters
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
