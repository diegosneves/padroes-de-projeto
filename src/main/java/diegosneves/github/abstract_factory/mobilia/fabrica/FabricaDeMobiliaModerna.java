package diegosneves.github.abstract_factory.mobilia.fabrica;

import diegosneves.github.abstract_factory.mobilia.enums.Familia;
import diegosneves.github.abstract_factory.mobilia.produtos.Cadeira;
import diegosneves.github.abstract_factory.mobilia.produtos.CadeiraModerna;
import diegosneves.github.abstract_factory.mobilia.produtos.Sofa;
import diegosneves.github.abstract_factory.mobilia.produtos.SofaModerno;

public class FabricaDeMobiliaModerna implements FabricaDeMobilia {


    @Override
    public Cadeira criarCadeira() {
        return new CadeiraModerna();
    }

    @Override
    public Sofa criarSofa(Integer quantidadeLugares) {
        return new SofaModerno(quantidadeLugares < 3 ? 2 : quantidadeLugares);
    }

    @Override
    public Familia getFamilia() {
        return Familia.MODERNA;
    }
}
