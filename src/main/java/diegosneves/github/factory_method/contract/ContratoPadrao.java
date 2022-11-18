package diegosneves.github.factory_method.contract;

public class ContratoPadrao extends Contrato {
    @Override
    public TipoDeContrato criarContrato() {
        return new Padrao();
    }
}
