package diegosneves.github.abstract_factory.mobilia.app;

import diegosneves.github.abstract_factory.mobilia.fabrica.FabricaDeMobilia;
import diegosneves.github.abstract_factory.mobilia.produtos.Cadeira;
import diegosneves.github.abstract_factory.mobilia.produtos.Sofa;

public class Cliente {

    private Cadeira cadeira;
    private Sofa sofa;
    private FabricaDeMobilia fabricaDeMobilia;

    public Cliente(FabricaDeMobilia fabricaDeMobilia) {
        this.fabricaDeMobilia = fabricaDeMobilia;
        this.cadeira = fabricaDeMobilia.criarCadeira();
    }

    public void criarMobiliaEMostrarDadosDaCriacao() {
        System.out.printf("Cadeiras: [%s]\n\t* Pernas: [%s]\n\t* Posso me sentar: [%s]\n", this.fabricaDeMobilia.getFamilia(), this.cadeira.temPernas() ? "Possui": "Não possui", this.cadeira.sentar() ? "Sim" : "Não");
    }

    public void criarMobiliaEMostrarDadosDaCriacao(Integer quantidadeDeLugaresParaSofa) {
        this.sofa = this.fabricaDeMobilia.criarSofa(quantidadeDeLugaresParaSofa);

        System.out.printf("Cadeiras: [%s]\n\t* Pernas: [%s]\n\t* Posso me sentar: [%s]\n", this.fabricaDeMobilia.getFamilia(), this.cadeira.temPernas() ? "Possui": "Não possui", this.cadeira.sentar() ? "Sim" : "Não");
        System.out.printf("Sofás: [%s]\n\t* Pernas: [%s]\n\t* Quantidade de Lugares: [%s]\n", this.fabricaDeMobilia.getFamilia(), this.sofa.temPernas() ? "Possui": "Não possui", this.sofa.quantidadeDeLugares());
    }

}
