package diegosneves.github.builder.livraria.builder;

import diegosneves.github.builder.livraria.componentes.TipoDeLivro;
import diegosneves.github.builder.livraria.model.Livro;

public interface Builder {

    void setTitulo(String titulo);

    void setTotalDePaginas(Integer totalDePaginas);

    void setTipoDeLivro(TipoDeLivro tipoDeLivro);

    Livro getResultado();

}
