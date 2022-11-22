package diegosneves.github.abstract_factory.mobilia.fabrica;

import diegosneves.github.abstract_factory.mobilia.enums.Familia;
import diegosneves.github.abstract_factory.mobilia.produtos.Cadeira;
import diegosneves.github.abstract_factory.mobilia.produtos.CadeiraVitoriana;
import diegosneves.github.abstract_factory.mobilia.produtos.Sofa;
import diegosneves.github.abstract_factory.mobilia.produtos.SofaVictoriano;

public class FabricaDeMobiliaVitoriana implements FabricaDeMobilia {


    @Override
    public Cadeira criarCadeira() {
        return new CadeiraVitoriana();
    }

    @Override
    public Sofa criarSofa(Integer quantidadeLugares) {
        return new SofaVictoriano(quantidadeLugares < 3 ? 2 : quantidadeLugares);
    }

    @Override
    public Familia getFamilia() {
        return Familia.VICTORIANA;
    }
}
