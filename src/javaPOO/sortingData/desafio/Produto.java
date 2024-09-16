package javaPOO.sortingData.desafio;

public class Produto implements Comparable<Produto> {
    String nome;
    double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public int compareTo(Produto o) {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("""
                Produto: %s
                Valor: %.2f
                """, this.nome, this.valor);
    }
}
