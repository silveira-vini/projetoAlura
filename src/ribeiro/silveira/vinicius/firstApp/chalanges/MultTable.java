package ribeiro.silveira.vinicius.firstApp.chalanges;

import java.util.Scanner;

public class MultTable {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.println("""
                ===TABUADA===
                Digite um valor:
                """);

        int num = entry.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.printf("%d x %d = %d \n", num, i, result);
        }

        entry.close();

    }

}
