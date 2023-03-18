package br.newtonPaiva.alunoLucas;

import java.util.Objects;

public class PessoaFisica extends Pessoa{
    String cfp;
    public String getCfp() {
        return cfp;
    }

    @Override
    public void validarDocumento() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PessoaFisica that = (PessoaFisica) o;
        return cfp.equals(that.cfp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cfp);
    }

    public void setCfp(String cfp) {
        this.cfp = cfp;
    }
}
