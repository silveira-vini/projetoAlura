package javaPOO.sortingData.desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        double saldo;
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

            produtos.add(new Produto(item, valor));

            System.out.println("Continuar comprando : 1-SIM  2-NÂO");
            opcao = entry.nextInt();

            if (opcao == 2) {
                System.out.println("Compras finalizadas");
            } else if (opcao != 1) {
                System.out.println("Opção inválida - Compra finalizada");
            }
        }

        System.out.println(produtos);















        entry.close();


    }

}
