package diegosneves.github.singleton.model;

import static java.util.Objects.isNull;

public class TesteSingleton {

    private static TesteSingleton instance;

    protected String valor;

    private TesteSingleton(String valor) {
        this.valor = valor;
    }

    public static TesteSingleton getInstance(String valor) {
        if (isNull(instance)) {
            instance = new TesteSingleton(valor);
        }
        return instance;
    }

    public String getValor() {
        return valor;
    }
}
