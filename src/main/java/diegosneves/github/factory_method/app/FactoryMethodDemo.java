package diegosneves.github.factory_method.app;

import diegosneves.github.factory_method.logistica.Logistica;
import diegosneves.github.factory_method.logistica.LogisticaAerea;
import diegosneves.github.factory_method.logistica.LogisticaMaritima;
import diegosneves.github.factory_method.logistica.LogisticaTerrestre;

public class FactoryMethodDemo {

    public static void main(String[] args) {

        situacaoDaEntrega(new LogisticaMaritima());
        situacaoDaEntrega(new LogisticaTerrestre());
        situacaoDaEntrega(new LogisticaAerea());

    }

    public static void situacaoDaEntrega(Logistica logistica) {
        logistica.planoDeEntrega();
    }

}
