package diegosneves.github.factory_method.logistica;

public abstract class Logistica {

    public void planoDeEntrega() {
        Transporte transporte = criarTransporte();
        transporte.entregar();
    }

    public abstract Transporte criarTransporte();

}
