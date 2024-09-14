package firstApp.chalanges;

import java.util.Scanner;

public class Choice {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.println("""
                Escolha entre as seguintes opções:
                Digite 1 para área do quadrado
                Digite 2 para área do círculo                
                """);

        int choice = entry.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("Digite a tamanho do lado do quadrado (em cm):");
                double side = entry.nextDouble();
                double area = Math.pow(side, 2);
                System.out.printf("Área do quadrado: %.1f cm²", area);
            }

            case 2: {
                System.out.println("Digite a tamanho do raio do círculo (em cm):");
                double radius = entry.nextDouble();
                double area = Math.PI * Math.pow(radius, 2);
                System.out.printf("Área do círculo: %.1f cm²", area);
            }

            break;
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }

        entry.close();

    }


}
