package diegosneves.github.factory_method.contract;

public class Customizado implements TipoDeContrato {

    @Override
    public void exibirContrato() {
        System.out.println("Exibindo contrato customizado");
    }
}
