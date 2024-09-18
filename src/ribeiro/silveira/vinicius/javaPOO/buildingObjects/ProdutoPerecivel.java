package ribeiro.silveira.vinicius.javaPOO.buildingObjects;

public class ProdutoPerecivel extends Product{

    String validade;

    public ProdutoPerecivel(String name, int amount, String validade) {
        super(name, amount);
        this.validade = validade;
    }

    @Override
    public String toString() {
        return "Produto: " + this.name + " Quantidade: " + this.amount
                + "\n   Validade: " + this.validade;
    }

}
