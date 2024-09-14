package firstApp.chalanges;

import java.util.Scanner;

public class Compare {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numA = entry.nextInt();

        System.out.println("Digite o segundo número:");
        int numB = entry.nextInt();

        if (numA > numB) {
            System.out.println("O primeiro é maior que o segundo");
        } else if (numB > numA) {
            System.out.println("O segundo é maio que o primeiro");
        } else {
            System.out.println("Os número são iguais");
        }

        entry.close();



    }


}
