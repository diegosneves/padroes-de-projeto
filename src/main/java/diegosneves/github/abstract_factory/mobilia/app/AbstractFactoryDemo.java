package diegosneves.github.abstract_factory.mobilia.app;

import diegosneves.github.abstract_factory.mobilia.fabrica.FabricaDeMobiliaModerna;
import diegosneves.github.abstract_factory.mobilia.fabrica.FabricaDeMobiliaVitoriana;

public class AbstractFactoryDemo {


    public static void main(String[] args) {
        Cliente cliente = new Cliente(new FabricaDeMobiliaVitoriana());
        cliente.criarMobiliaEMostrarDadosDaCriacao(3);

        cliente = new Cliente(new FabricaDeMobiliaModerna());
        cliente.criarMobiliaEMostrarDadosDaCriacao(4);

    }

}
