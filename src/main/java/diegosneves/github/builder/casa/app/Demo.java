package diegosneves.github.builder.casa.app;

import diegosneves.github.builder.casa.builder.CasaBuilder;
import diegosneves.github.builder.casa.diretor.Construtora;
import diegosneves.github.builder.casa.entity.Casa;

public class Demo {

    public static void main(String[] args) {

        Construtora construtora = new Construtora();
        CasaBuilder builder = new CasaBuilder();

        construtora.construirCasaDePedraSemGaragem(builder);
        Casa casa = builder.getResultado();
        System.out.println(casa);

        construtora.construirCasaDePedraComGaragem(builder);
        casa = builder.getResultado();
        System.out.println(casa);

        construtora.construirCasaDePedraDoisPisosComGaragem(builder);
        casa = builder.getResultado();
        System.out.println(casa);

    }

}
