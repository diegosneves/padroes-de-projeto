package diegosneves.github.factory_method.logistica;

import diegosneves.github.factory_method.enums.Entregas;

public class Caminhao implements Transporte {

    @Override
    public void entregar() {
        Entregas.TERRESTRE.exibirMensagem();
    }
}
