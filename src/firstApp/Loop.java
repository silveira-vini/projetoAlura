package firstApp;

import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        double rate = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a avaliação do filme");
            rate += entry.nextDouble();

        }

        double average = rate / 3;

        System.out.println(average);


    }



}
