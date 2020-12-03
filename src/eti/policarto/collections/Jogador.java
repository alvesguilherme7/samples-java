package eti.policarto.collections;

public class Jogador implements Comparable<Jogador> {

    private String nome;
    private Integer numero;

    public Jogador(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }

    @Override
    public int compareTo(Jogador outro) {
        return this.nome.compareTo(outro.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
