package diegosneves.github.abstract_factory.estoque.produto;

import diegosneves.github.abstract_factory.estoque.enums.Tipo;

public class LivroDigital implements Livro {

    private String nome;
    private Integer paginas;
    private Double tamanhoDoArquivo;

    public LivroDigital(String nome, Integer paginas, Double tamanhoDoArquivo) {
        this.nome = nome;
        this.paginas = paginas;
        this.tamanhoDoArquivo = tamanhoDoArquivo;
    }

    public Double getTamanhoDoArquivo() {
        return tamanhoDoArquivo;
    }

    @Override
    public Integer totalDePaginas() {
        return this.paginas;
    }

    @Override
    public Tipo getTipo() {
        return Tipo.DIGITAL;
    }

    @Override
    public String toString() {
        return String.format("Livro: [%s]\n\t* Titulo: [%s]\n\t* Páginas: [%02d]\n\t* Tamanho do Arquivo: [%.2f] Mb", this.getTipo(), this.nome, this.paginas, this.getTamanhoDoArquivo());
    }
}
