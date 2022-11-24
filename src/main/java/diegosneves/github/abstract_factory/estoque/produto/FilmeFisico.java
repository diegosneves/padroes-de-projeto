package diegosneves.github.abstract_factory.estoque.produto;

import diegosneves.github.abstract_factory.estoque.enums.Tipo;

public class FilmeFisico implements Filmes {

    private String nome;
    private Integer tempoDeFilme;

    public FilmeFisico(String nome, Integer tempoDeFilme) {
        this.nome = nome;
        this.tempoDeFilme = tempoDeFilme;
    }

    @Override
    public Integer getDuracao() {
        return this.tempoDeFilme;
    }

    @Override
    public Tipo getTipo() {
        return Tipo.FISICO;
    }

    @Override
    public String toString() {
        return String.format("Filme: [%s]\n\t* Titulo: [%s]\n\t* Duração: [%02d] min.", this.getTipo(), this.nome, this.tempoDeFilme);
    }
}
