package diegosneves.github.abstract_factory.estoque.produto;

import diegosneves.github.abstract_factory.estoque.enums.Tipo;

public class FilmeDigital implements Filmes {

    private String nome;
    private Integer tempoDeFilme;
    private Double tamanhoDoArquivo;

    public FilmeDigital(String nome, Integer tempoDeFilme, Double tamanhoDoArquivo) {
        this.nome = nome;
        this.tempoDeFilme = tempoDeFilme;
        this.tamanhoDoArquivo = tamanhoDoArquivo;
    }

    @Override
    public Integer getDuracao() {
        return this.tempoDeFilme;
    }

    @Override
    public Tipo getTipo() {
        return Tipo.DIGITAL;
    }

    @Override
    public String toString() {
        return String.format("Filme: [%s]\n\t* Titulo: [%s]\n\t* Duração: [%02d] min.\n\t* Tamanho do Arquivo: [%.2f] Gb.", this.getTipo(), this.nome, this.tempoDeFilme, this.tamanhoDoArquivo);
    }
}
