package diegosneves.github.factory_method.logistica;

import diegosneves.github.factory_method.enums.Entregas;

public class Navio implements Transporte {

    @Override
    public void entregar() {
        Entregas.MARITIMA.exibirMensagem();
    }
}
