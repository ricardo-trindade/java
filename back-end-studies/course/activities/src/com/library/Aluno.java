package com.library;

public class Aluno extends Usuario {

    public Aluno(int id, String nome, String email) {
        super(id, nome, email);
    }

    @Override
    public int getLimiteEmprestimos() {
        return 0;
    }


}
