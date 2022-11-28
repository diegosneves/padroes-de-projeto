package diegosneves.github.builder.livraria.componentes;

import diegosneves.github.abstract_factory.estoque.enums.Tipo;

public class Digital implements TipoDeLivro {

    private Double tamanhoDoArquivo;

    public Digital(Double tamanhoDoArquivo) {
        this.tamanhoDoArquivo = tamanhoDoArquivo;
    }

    @Override
    public Tipo getTipo() {
        return Tipo.DIGITAL;
    }


    @Override
    public String toString() {
        return String.format("Tipo: [%s]\n\t* Tamanho do arquivo: [%.1f] Mb.", this.getTipo(), this.tamanhoDoArquivo);
    }
}
