package diegosneves.github.factory_method.contract;

public abstract class Contrato {

    public void tipoDeContrato() {
        TipoDeContrato tipoDeContrato = criarContrato();
        tipoDeContrato.exibirContrato();
    }

    public abstract TipoDeContrato criarContrato();

}
