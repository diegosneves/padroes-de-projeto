package diegosneves.github.factory_method.logistica;

public class LogisticaTerrestre extends Logistica{

    @Override
    public Transporte criarTransporte() {
        return new Caminhao();
    }
}
