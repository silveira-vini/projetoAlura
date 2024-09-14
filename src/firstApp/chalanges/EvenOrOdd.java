package firstApp.chalanges;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int num = entry.nextInt();

        if (num % 2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }

        entry.close();

    }

}
