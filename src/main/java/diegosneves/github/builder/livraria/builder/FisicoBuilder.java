package diegosneves.github.builder.livraria.builder;

import diegosneves.github.builder.livraria.componentes.TipoDeLivro;
import diegosneves.github.builder.livraria.model.Livro;

public class FisicoBuilder implements Builder {

    private String titulo;
    private Integer totalDePaginas;
    private TipoDeLivro tipoDeLivro;
    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void setTotalDePaginas(Integer totalDePaginas) {
        this.totalDePaginas = totalDePaginas;
    }

    @Override
    public void setTipoDeLivro(TipoDeLivro tipoDeLivro) {
        this.tipoDeLivro = tipoDeLivro;
    }

    @Override
    public Livro getResultado() {
        return new Livro(this.titulo, this.totalDePaginas, this.tipoDeLivro);
    }
}
