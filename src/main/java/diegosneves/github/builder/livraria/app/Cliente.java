package diegosneves.github.builder.livraria.app;

import diegosneves.github.builder.livraria.builder.Builder;
import diegosneves.github.builder.livraria.builder.DigitalBuilder;
import diegosneves.github.builder.livraria.builder.FisicoBuilder;
import diegosneves.github.builder.livraria.diretor.Editora;
import diegosneves.github.builder.livraria.model.Livro;

public class Cliente {

    public static void main(String[] args) {

        Editora editora = new Editora();
        Builder builder = new DigitalBuilder();

        editora.criarLivroDigital(builder);
        Livro resultado = builder.getResultado();
        System.out.println(resultado);

        System.out.println();

        builder = new FisicoBuilder();
        editora.criarLivroFisicoCapaDura(builder);
        resultado = builder.getResultado();
        System.out.println(resultado);

        System.out.println();

        editora.criarLivroFisicoCapaSimples(builder);
        resultado = builder.getResultado();
        System.out.println(resultado);

    }

}
