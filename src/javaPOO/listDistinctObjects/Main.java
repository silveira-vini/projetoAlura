package javaPOO.listDistinctObjects;

import javaPOO.buildingObjects.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Vinicius");
        names.add("Fabiana");
        names.add("Lola");
        names.add("Príncipe");

        names.forEach(System.out::println);


        Animal animal = new Dog();

        if (animal instanceof Dog) {
            Dog d1 = (Dog) animal;
        } else {
            System.out.println("The object is not a Dog");
        }

        Produto p1 = new Produto("Martelo", 8.90);
        Produto p2 = new Produto("Alicate", 12.85);
        Produto p3 = new Produto("Cegueta", 5.50);

        List<Produto> carrinho = Arrays.asList(p1, p2, p3);

        double soma = 0;
        for (Produto p : carrinho) {
            soma += p.getPreco();
        }

        double media = soma / carrinho.size();
        System.out.printf("%.2f \n", media);

        Forma f1 = new Quadrado(5.5);
        Forma f2 = new Circulo(3.0);
        Forma f3 = new Quadrado(6);
        Forma f4 = new Circulo(3.9);

        List<Forma> objetos = Arrays.asList(f1, f2, f3, f4);

        for (Forma f : objetos) {
            System.out.printf("Área: %.2f\n", f.calcularArea());
        }

        ContaBancaria c1 = new ContaBancaria(2348, 1485.52);
        ContaBancaria c2 = new ContaBancaria(3574, 758.24);
        ContaBancaria c3 = new ContaBancaria(8728, 10587.02);
        ContaBancaria c4 = new ContaBancaria(3485, 158.01);

        List<ContaBancaria> contas = Arrays.asList(c1, c2, c3, c4);
        double maiorSaldo = 0;
        int contaDeMaiorSaldo = 0;
        for (ContaBancaria cc : contas) {
            if (cc.getSaldo() > maiorSaldo) {
                maiorSaldo = cc.getSaldo();
                contaDeMaiorSaldo = cc.getNumeroConta();
            }
        }
        System.out.printf("""
                A Conta de maior saldo é a: %d
                O saldo é de: %.2f
                """, contaDeMaiorSaldo, maiorSaldo);

    }
}
