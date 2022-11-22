package diegosneves.github.abstract_factory.mobilia.produtos;

public class SofaVictoriano implements Sofa {

    private Integer quantidadeDeLugares = 2;

    public SofaVictoriano(Integer quantidadeDeLugares) {
        this.quantidadeDeLugares = quantidadeDeLugares;
    }

    @Override
    public Boolean temPernas() {
        return Boolean.TRUE;
    }

    @Override
    public Integer quantidadeDeLugares() {
        return this.quantidadeDeLugares;
    }
}
