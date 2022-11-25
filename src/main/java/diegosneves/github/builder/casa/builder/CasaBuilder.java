package diegosneves.github.builder.casa.builder;

import diegosneves.github.builder.casa.entity.Casa;
import diegosneves.github.builder.casa.entity.Material;

public class CasaBuilder implements Builder {

    private Material material;
    private Integer pisos;
    private Integer portas;
    private Integer janelas;
    private Boolean garagem;


    @Override
    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public void setPisos(Integer quantidadeDePisos) {
        this.pisos = quantidadeDePisos;
    }

    @Override
    public void setPortas(Integer quantidadeDePortas) {
        this.portas = quantidadeDePortas;
    }

    @Override
    public void setJanelas(Integer quantidadeDeJanelas) {
        this.janelas = quantidadeDeJanelas;
    }

    @Override
    public void setGaragem(Boolean possuiGaragem) {
        this.garagem = possuiGaragem;
    }

    public Casa getResultado() {
        return new Casa(this.material, this.pisos, this.portas, this.janelas, this.garagem);
    }

}
