package diegosneves.github.abstract_factory.estoque.produto;

import diegosneves.github.abstract_factory.estoque.enums.Capa;
import diegosneves.github.abstract_factory.estoque.enums.Tipo;

public class LivroFisico implements Livro {

    private String nome;
    private Integer paginas;
    private Capa capa;

    public LivroFisico(String nome, Integer paginas, Capa capa) {
        this.nome = nome;
        this.paginas = paginas;
        this.capa = capa;
    }

    @Override
    public Integer totalDePaginas() {
        return this.paginas;
    }

    @Override
    public Tipo getTipo() {
        return Tipo.FISICO;
    }

    @Override
    public String toString() {
        return String.format("Livro: [%s]\n\t* Titulo: [%s]\n\t* Páginas: [%02d]\n\t* Capa: [%s]", this.getTipo(), this.nome, this.paginas, this.capa);
    }
}
