package diegosneves.github.abstract_factory.estoque.fabrica;

import diegosneves.github.abstract_factory.estoque.produto.Filmes;
import diegosneves.github.abstract_factory.estoque.produto.Livro;

public interface FabricaAbstrata {

    Filmes criarFilme();

    Livro criarLivro();

}
