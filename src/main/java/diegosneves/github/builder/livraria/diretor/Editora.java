package diegosneves.github.builder.livraria.diretor;

import diegosneves.github.abstract_factory.estoque.enums.Capa;
import diegosneves.github.builder.livraria.builder.Builder;
import diegosneves.github.builder.livraria.componentes.Digital;
import diegosneves.github.builder.livraria.componentes.Fisico;

public class Editora {


    public void criarLivroDigital(Builder builder) {
        builder.setTitulo("Livro Um");
        builder.setTotalDePaginas(250);
        builder.setTipoDeLivro(new Digital(36.0));
    }

    public void criarLivroFisicoCapaDura(Builder builder) {
        builder.setTitulo("Livro Um");
        builder.setTotalDePaginas(250);
        builder.setTipoDeLivro(new Fisico(Capa.DURA));
    }

    public void criarLivroFisicoCapaSimples(Builder builder) {
        builder.setTitulo("Livro Um");
        builder.setTotalDePaginas(250);
        builder.setTipoDeLivro(new Fisico(Capa.SIMPLES));
    }

}
