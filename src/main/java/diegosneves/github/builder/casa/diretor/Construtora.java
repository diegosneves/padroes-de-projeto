package diegosneves.github.builder.casa.diretor;

import diegosneves.github.builder.casa.builder.Builder;
import diegosneves.github.builder.casa.entity.Material;

public class Construtora {

    public void construirCasaDePedraSemGaragem(Builder builder) {
        builder.setMaterial(Material.PEDRA);
        builder.setPisos(1);
        builder.setPortas(2);
        builder.setJanelas(4);
    }

    public void construirCasaDePedraComGaragem(Builder builder) {
        builder.setMaterial(Material.PEDRA);
        builder.setPisos(1);
        builder.setPortas(2);
        builder.setJanelas(4);
        builder.setGaragem(Boolean.TRUE);
    }

    public void construirCasaDePedraDoisPisosComGaragem(Builder builder) {
        builder.setMaterial(Material.PEDRA);
        builder.setPisos(2);
        builder.setPortas(2);
        builder.setJanelas(8);
        builder.setGaragem(Boolean.TRUE);
    }

}
