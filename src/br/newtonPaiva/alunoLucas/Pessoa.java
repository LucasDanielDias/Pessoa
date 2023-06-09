package br.newtonPaiva.alunoLucas;

import java.util.Objects;

public abstract class Pessoa {
    String nome;
    public void setNome(String nome) {
        this.nome = nome;
    }
        public String getNome() {
            return nome;
    }
        public abstract void validarDocumento();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return nome.equals(pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
