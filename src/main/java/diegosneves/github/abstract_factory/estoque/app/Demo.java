package diegosneves.github.abstract_factory.estoque.app;

import diegosneves.github.abstract_factory.estoque.fabrica.FabricaAbstrataDigital;
import diegosneves.github.abstract_factory.estoque.fabrica.FabricaAbstrataFisica;

public class Demo {

    private static Fabricar fabricar;

    public static void main(String[] args) {
        fabricar = new Fabricar(new FabricaAbstrataDigital());
        fabricar.fabricarItens();

        System.out.println();
        System.out.println();

        fabricar = new Fabricar(new FabricaAbstrataFisica());
        fabricar.fabricarItens();
    }

}
