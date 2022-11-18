package diegosneves.github.factory_method.enums;

public enum Entregas {

    TERRESTRE("terra", "caixa"),
    MARITIMA("mar", "contêiner"),
    AEREA("ar", "malote");

    private String porOnde;
    private String oQue;

    Entregas(String porOnde, String oQue) {
        this.porOnde = porOnde;
        this.oQue = oQue;
    }

    public void exibirMensagem() {
        System.out.printf("Entrega por %s em um(a) %s!\n", this.porOnde, this.oQue);
    }

}
