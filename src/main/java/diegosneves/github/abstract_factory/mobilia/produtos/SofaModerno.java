package diegosneves.github.abstract_factory.mobilia.produtos;

public class SofaModerno implements Sofa {

    private Integer quantidadeDeLugares = 2;

    public SofaModerno(Integer quantidadeDeLugares) {
        this.quantidadeDeLugares = quantidadeDeLugares;
    }

    @Override
    public Boolean temPernas() {
        return Boolean.FALSE;
    }

    @Override
    public Integer quantidadeDeLugares() {
        return this.quantidadeDeLugares;
    }
}
