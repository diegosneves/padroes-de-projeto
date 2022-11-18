package diegosneves.github.factory_method.logistica;

import diegosneves.github.factory_method.enums.Entregas;

public class Aviao implements Transporte {

    @Override
    public void entregar() {
        Entregas.AEREA.exibirMensagem();
    }
}
