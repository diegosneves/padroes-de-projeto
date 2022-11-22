package diegosneves.github.abstract_factory.mobilia.produtos;

public class CadeiraVitoriana implements Cadeira {


    @Override
    public Boolean temPernas() {
        return Boolean.TRUE;
    }

    @Override
    public Boolean sentar() {
        return Boolean.TRUE;
    }
}
