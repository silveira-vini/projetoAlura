import java.util.Random;
import java.util.Scanner;

public class Guess {

    public static void main(String[] args) {

        int luckyNumber = new Random().nextInt(100);


        Scanner entry = new Scanner(System.in);

        System.out.println("JOGO DA ADVINHAÇÃO");
        System.out.println("Adivinhe qual número de 1 a 100");
        System.out.println("Você tem 5 chances");
        int kick = -1;
        int tries = 1;

        while (tries <= 5) {
            kick = entry.nextInt();
            if (kick < luckyNumber) {
                System.out.println("Número errado.");
                System.out.println("O número que você informou é MENOR que o número da sorte");
                System.out.println("Tentativas: " + tries);
            } else if (kick > luckyNumber) {
                System.out.println("Número errado.");
                System.out.println("O número que você informou é MAIOR que o número da sorte");
                System.out.println("Tentativas: " + tries);
            }
            tries++;
        }

        if (kick == luckyNumber) {
            System.out.println("PARABÉNS!!");
            System.out.println("\nVocê acertou o número da sorte: " + luckyNumber);
        } else {
            System.out.println("\nVocê não acertou o número da sorte: " + luckyNumber);
        }

        entry.close();

    }


}
