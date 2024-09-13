import java.util.Scanner;

public class While {

    public static void main(String[] args) {


        Scanner entry = new Scanner(System.in);

        double average;
        double rate = 0;
        int grade = 0;
        int gradesTotal = 0;


        while ( gradesTotal < 5) {
            System.out.println("Digite uma nota:");
            grade += entry.nextInt();
            gradesTotal++;

        }

        average = (double) grade / gradesTotal;
        System.out.println(average);
    }
}
