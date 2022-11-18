package diegosneves.github.factory_method.contract;

public class FactoryContratoDemo {

    private static Contrato contrato;

    public static void main(String[] args) {
        exibirContrato(new ContratoPadrao());
        exibirContrato(new ContratoCustomizado());
    }

    private static void exibirContrato(Contrato contrato) {
        contrato.tipoDeContrato();
    }

}
