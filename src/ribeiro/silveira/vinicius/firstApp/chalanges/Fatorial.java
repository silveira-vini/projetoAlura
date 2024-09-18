package ribeiro.silveira.vinicius.firstApp.chalanges;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.println("Digite um valor para resultado de Fatorial:");

        int num = entry.nextInt();

        int fatorial = 1;

        for (int i = 0; i < num; i++) {
            fatorial *= (num - i);
        }

        System.out.printf("O fatorial de %d é %d", num, fatorial);

        entry.close();

    }



}
