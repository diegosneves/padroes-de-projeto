package diegosneves.github.abstract_factory.estoque.fabrica;

import diegosneves.github.abstract_factory.estoque.produto.FilmeDigital;
import diegosneves.github.abstract_factory.estoque.produto.Filmes;
import diegosneves.github.abstract_factory.estoque.produto.Livro;
import diegosneves.github.abstract_factory.estoque.produto.LivroDigital;

public class FabricaAbstrataDigital implements FabricaAbstrata {

    @Override
    public Filmes criarFilme() {
        return new FilmeDigital("Avatar", 140, 24.0);
    }

    @Override
    public Livro criarLivro() {
        return new LivroDigital("Sapiens", 687, 24.5);
    }

}
