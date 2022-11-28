package diegosneves.github.builder.livraria.model;

import diegosneves.github.builder.livraria.componentes.TipoDeLivro;

public class Livro {

    private String titulo;
    private Integer totalDePaginas;
    private TipoDeLivro tipoDeLivro;

    public Livro(String titulo, Integer totalDePaginas, TipoDeLivro tipoDeLivro) {
        this.titulo = titulo;
        this.totalDePaginas = totalDePaginas;
        this.tipoDeLivro = tipoDeLivro;
    }

    @Override
    public String toString() {
        return String.format("Titulo: [%s]\nTotal de Paginas: [%02d] pág.\n%s", this.titulo, this.totalDePaginas, this.tipoDeLivro);
    }
}
