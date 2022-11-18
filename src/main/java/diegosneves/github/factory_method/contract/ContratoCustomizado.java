package diegosneves.github.factory_method.contract;

public class ContratoCustomizado extends Contrato {

    @Override
    public TipoDeContrato criarContrato() {
        return new Customizado();
    }
}
