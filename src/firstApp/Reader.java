package firstApp;

import java.util.Scanner;

public class Reader {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.println("Digite o filme");
        String movie = entry.nextLine();
        System.out.println("Excelente filme " + movie);





        entry.close();


    }


}
