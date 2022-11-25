package diegosneves.github.builder.casa.entity;

import static java.util.Objects.isNull;

public class Casa {

    private Material material;
    private Integer pisos;
    private Integer portas;
    private Integer janelas;
    private Boolean garagem;


    public Casa(Material material, Integer pisos, Integer portas, Integer janelas, Boolean garagem) {
        this.material = material;
        this.pisos = pisos;
        this.portas = portas;
        this.janelas = janelas;
        this.garagem = isNull(garagem) ? Boolean.FALSE : Boolean.TRUE;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "material=" + material +
                ", pisos=" + pisos +
                ", portas=" + portas +
                ", janelas=" + janelas +
                ", garagem=" + garagem +
                '}';
    }
}
