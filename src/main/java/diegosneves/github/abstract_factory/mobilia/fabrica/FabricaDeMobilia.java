package diegosneves.github.abstract_factory.mobilia.fabrica;

import diegosneves.github.abstract_factory.mobilia.enums.Familia;
import diegosneves.github.abstract_factory.mobilia.produtos.Cadeira;
import diegosneves.github.abstract_factory.mobilia.produtos.Sofa;

public interface FabricaDeMobilia {

    Cadeira criarCadeira();

    Sofa criarSofa(Integer quantidadeLugares);

    Familia getFamilia();

}
