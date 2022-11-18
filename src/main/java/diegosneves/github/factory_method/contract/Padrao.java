package diegosneves.github.factory_method.contract;

public class Padrao implements TipoDeContrato {

    @Override
    public void exibirContrato() {
        System.out.println("Exibindo o Contrato Padrão");
    }
}
