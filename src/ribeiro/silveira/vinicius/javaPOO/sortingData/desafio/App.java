package ribeiro.silveira.vinicius.javaPOO.sortingData.desafio;

import java.util.*;

public class App {
    public static void main(String[] args) {

        double limite;
        int opcao = 1;

        List<Produto> produtos = new ArrayList<>();

        Scanner entry = new Scanner(System.in);

        System.out.println("CARTÃO DE CRÉDITO");
        System.out.println("Digite o limite do cartão:");
        limite = entry.nextDouble();

        while (opcao == 1) {
            String item;
            double valor;

            System.out.print("Digite o item comprado: ");
            item = entry.next();

            System.out.print("Digite o valor do produto: R$ ");
            valor = entry.nextDouble();

            if (valor <= limite) {
                produtos.add(new Produto(item, valor));
                limite -= valor;
            } else {
                System.out.println("Limite insuficiente para essa compra");
                System.out.println("Limite restante: R$ " + limite);
            }

            System.out.println("Continuar comprando : 1-SIM  2-NÂO");
            opcao = entry.nextInt();
            if (opcao == 2) {
                System.out.println("Compras finalizadas");
            } else if (opcao != 1) {
                System.out.println("Opção inválida - Compra finalizada");
            }
        }
        entry.close();

        System.out.println(" ");
        System.out.println("=== LISTA DE COMPRAS ===");
        produtos.sort(Comparator.comparing(Produto::getValor));
        System.out.println(produtos);
    }

}
