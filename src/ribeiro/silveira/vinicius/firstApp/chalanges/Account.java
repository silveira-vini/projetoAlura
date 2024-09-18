package ribeiro.silveira.vinicius.firstApp.chalanges;

import java.util.Scanner;

public class Account {

    public static void main(String[] args) {

        String name = "Vinicius Silveira Ribeiro";
        String account = "581.28541-6";
        double balance = 5487.89;
        int option = 0;

        System.out.printf("""
                
                =========== INTERNATIONAL BANK ===========
                Name: %s
                Account: %s
                Balance: USD$ %.2f
                
                """, name, account, balance);

        Scanner entry = new Scanner(System.in);

        while (option != 4) {
            System.out.println("""
                    == MENU ==
                    1 - Balance
                    2 - Deposit
                    3 - Withdraw
                    4 - Exit
                    Type you option:""");
            option = entry.nextInt();

            switch (option) {
                case 1: {
                    System.out.printf("Account Balance: %.2f \n\n", balance);
                    break;
                }
                case 2: {
                    System.out.println("How much do you want to deposit:");
                    double deposit = entry.nextDouble();
                    balance += deposit;
                    System.out.printf("New balance: %.2f \n\n", balance);
                    break;
                }
                case 3: {
                    System.out.println("How much do you want to whithdraw:");
                    double withdraw = entry.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.printf("Withdraw success. New balance: %.2f \n\n", balance);
                    } else {
                        System.out.println("Impossible to withdraw. \nThere are insufficient funds in the account \n\n");
                    }
                    break;
                }
                case 4: {
                    System.out.println("System Exiting....");
                    break;
                }
                default: {
                    System.out.println("Invalid option \n\n");
                    break;
                }
            }
        }
        System.out.println("System Shut Down!!!");
        entry.close();
    }
}
