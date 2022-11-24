package diegosneves.github.abstract_factory.estoque.fabrica;

import diegosneves.github.abstract_factory.estoque.enums.Capa;
import diegosneves.github.abstract_factory.estoque.produto.FilmeFisico;
import diegosneves.github.abstract_factory.estoque.produto.Filmes;
import diegosneves.github.abstract_factory.estoque.produto.Livro;
import diegosneves.github.abstract_factory.estoque.produto.LivroFisico;

public class FabricaAbstrataFisica implements FabricaAbstrata {

    @Override
    public Filmes criarFilme() {
        return new FilmeFisico("O Jogo da Imitação", 122);
    }

    @Override
    public Livro criarLivro() {
        return new LivroFisico("Uma Breve Historia da Humanidade", 826, Capa.DURA);
    }

}
