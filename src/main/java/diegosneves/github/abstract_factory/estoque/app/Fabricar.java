package diegosneves.github.abstract_factory.estoque.app;

import diegosneves.github.abstract_factory.estoque.fabrica.FabricaAbstrata;

public class Fabricar {

    private FabricaAbstrata fabricaAbstrata;

    public Fabricar(FabricaAbstrata fabricaAbstrata) {
        this.fabricaAbstrata = fabricaAbstrata;
    }

    public void fabricarItens() {
        System.out.println(this.fabricaAbstrata.criarLivro());
        System.out.println();
        System.out.println(this.fabricaAbstrata.criarFilme());
    }

}
