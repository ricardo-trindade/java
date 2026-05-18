package com.library;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public void adicionarLivro(Livro l) {
        if (l != null) {
            livros.add(l);
        }
    }

    public Livro buscarLivro(String isbn) {
        if (isbn == null) return null;
        for (Livro l : livros) {
            String c = String.valueOf(l.getIsbn());
            if (c != null && c.equals(isbn)) {
                return l;
            }
        }
        return null;
    }

    public void emprestarLivro(Usuario u, String codigo) {
        Livro livro = buscarLivro(codigo);
        if (livro == null) {
            System.out.println("Livro não encontrado.");
            return;
        }
        if (!"DISPONÍVEL".equals(livro.getStatus())) {
            System.out.println("Livro indisponível.");
            return;
        }
        long qtdEmprestimosUsuario = emprestimos.stream()
                .filter(e -> e.getUsuario().getId() == u.getId())
                .count();
        if (qtdEmprestimosUsuario >= u.getLimiteEmprestimos()) {
            System.out.println("Usuário atingiu o limite de empréstimos.");
            return;
        }
        livro.emprestar(u);
        Emprestimo emprestimo = new Emprestimo(livro, u);
        emprestimos.add(emprestimo);
        System.out.println("Livro " + livro.getTitulo() + " emprestado para " + u.getNome());
    }

    public void devolverLivro(Usuario u, String codigo) {
        Livro livro = buscarLivro(codigo);
        if (livro == null) {
            System.out.println("Livro não encontrado.");
            return;
        }
        livro.devolver();
        emprestimos.removeIf(e -> {
            String c = String.valueOf(e.getLivro().getIsbn());
            return c != null && c.equals(codigo) && e.getUsuario().getId() == u.getId();
        });
        System.out.println("Livro " + livro.getTitulo() + " devolvido por " + u.getNome());
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro registrado.");
            return;
        }
        System.out.println("\nLivros registrados: ");
        for (Livro l : livros) {
            System.out.println("Código: " + l.getIsbn() +
                    " | Título: " + l.getTitulo() +
                    " | Autor: " + l.getAutor() +
                    " | Status: " + l.getStatus());
        }
    }
}
