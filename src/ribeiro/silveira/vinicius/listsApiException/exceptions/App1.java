package ribeiro.silveira.vinicius.listsApiException.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App1 {

    public static void main(String[] args) {


        Scanner entry = new Scanner(System.in);

        double num1;
        double num2;


        System.out.println("=== SPLIT ===");

        try {
            System.out.println("Type the first number:");
            num1 = entry.nextDouble();

            System.out.println("Typoe the second number:");
            num2 = entry.nextDouble();

            System.out.println("Result:");

            double result = num1 / num2;
            System.out.printf("%.1f / %.1f = %.1f", num1, num2, result);

        } catch (InputMismatchException e) {
            System.out.println("Error: didn't type a number");
        }

        entry.close();

    }

}
