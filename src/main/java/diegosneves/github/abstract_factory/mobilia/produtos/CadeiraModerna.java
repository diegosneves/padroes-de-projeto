package diegosneves.github.abstract_factory.mobilia.produtos;

public class CadeiraModerna implements Cadeira {


    @Override
    public Boolean temPernas() {
        return Boolean.FALSE;
    }

    @Override
    public Boolean sentar() {
        return Boolean.TRUE;
    }
}
