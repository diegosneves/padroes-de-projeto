package diegosneves.github.factory_method.logistica;

public class LogisticaMaritima extends Logistica {
    @Override
    public Transporte criarTransporte() {
        return new Navio();
    }
}
