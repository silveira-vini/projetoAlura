package firstApp;

public class Main {

    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match");

        System.out.println("Filme: Top Gun Maverick");

        int year = 2022;
        System.out.println("Ano de lançamento: " + year);
        boolean inPlan = true;
        double grade = 8.5;

        double average = (9.8 + 6.3 + 8.0) / 3;
        System.out.printf("A média é: %.2f", average);

        String resume = """
                
                Filme de abertura 
                Ator: Tom Cruise
                Ano de lançamento: 
                """
                ;

        System.out.println(resume + year);

        int rate = (int) average;
        System.out.println(rate);

        // (temperature * 1.8) + 32
        int temperatureC = 25;
        double temperatureF;

        temperatureF = (temperatureC * 1.8) + 32;
        System.out.println(temperatureF);




    }
}