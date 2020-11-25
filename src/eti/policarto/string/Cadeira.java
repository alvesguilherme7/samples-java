package eti.policarto.string;

public class Cadeira {

    float largura;
    float altura;

    public Cadeira(float largura, float altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cadeira{" +
                "largura=" + largura +
                ", altura=" + altura +
                '}';
    }
}
