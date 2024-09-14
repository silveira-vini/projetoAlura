package firstApp.chalanges;

import java.util.Scanner;

public class PositiveOrNegative {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.println("Digite um número");
        int num = entry.nextInt();

        if (num > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }

        entry.close();
    }

}
