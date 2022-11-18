package diegosneves.github.factory_method.logistica;

public class LogisticaAerea extends Logistica {

    @Override
    public Transporte criarTransporte() {
        return new Aviao();
    }
}
