package br.newtonPaiva.alunoLucas;

import java.util.Objects;

private class Pessoa {
    String nome;
    public void setNome(String nome) {
        this.nome = nome;
    }
        public String getNome() {
            return nome;
    }
        public String validarDocumento(){
            return validarDocumento();
        }

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
