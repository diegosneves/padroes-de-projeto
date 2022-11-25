package diegosneves.github.builder.casa.builder;

import diegosneves.github.builder.casa.entity.Material;

public interface Builder {

    void setMaterial(Material material);

    void setPisos(Integer quantidadeDePisos);

    void setPortas(Integer quantidadeDePortas);

    void setJanelas(Integer quantidadeDeJanelas);

    void setGaragem(Boolean possuiGaragem);

}
