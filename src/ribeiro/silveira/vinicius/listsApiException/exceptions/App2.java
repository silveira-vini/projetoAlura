package ribeiro.silveira.vinicius.listsApiException.exceptions;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.println("Type your password:");
        String password = entry.next();

        try {
            testPassword(password);
            System.out.println("Password accept");

        } catch (PasswordInvalidException e) {

            System.out.println("Erro: " + e.getMessage());

        }

        entry.close();
    }

    private static void testPassword(String password) {
        if (password.length() < 8) {
            throw new PasswordInvalidException("Password must be at least 8 characters long");
        }
    }

}
