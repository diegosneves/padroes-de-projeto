package diegosneves.github.builder.livraria.componentes;

import diegosneves.github.abstract_factory.estoque.enums.Capa;
import diegosneves.github.abstract_factory.estoque.enums.Tipo;

public class Fisico implements TipoDeLivro {

    private Capa capa;

    public Fisico(Capa capa) {
        this.capa = capa;
    }

    @Override
    public Tipo getTipo() {
        return Tipo.FISICO;
    }


    @Override
    public String toString() {
        return String.format("Tipo: [%s]\n\t* Capa: [%s].", this.getTipo(), this.capa);
    }
}
