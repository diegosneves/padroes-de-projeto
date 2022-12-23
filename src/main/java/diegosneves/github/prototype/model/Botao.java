package diegosneves.github.prototype.model;

import static java.util.Objects.nonNull;

public class Botao implements Prototipo {

    private Integer x;
    private Integer y;
    private String cor;

    public Botao(Integer x, Integer y, String cor) {
        this.x = x;
        this.y = y;
        this.cor = cor;
    }

    public Botao(Botao botao) {
        if (nonNull(botao)) {
            this.x = botao.getX();
            this.y = botao.getY();
            this.cor = botao.getCor();
        }
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    @Override
    public String getCor() {
        return this.cor;
    }

    @Override
    public Prototipo clone() {
        return new Botao(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Botao)) {
            return false;
        }

        Botao botao = (Botao) obj;

        return this.x.equals(botao.x) && this.y.equals(botao.y) && this.cor.equals(botao.cor);
    }

    @Override
    public String toString() {
        return String.format("X: %02d - Y: %02d - COR: %s", this.x, this.y, this.cor);
    }
}
