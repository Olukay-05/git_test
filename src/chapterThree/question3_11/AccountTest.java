package chapterThree.question3_11;

import java.util.Scanner;

public class AccountTest {
        public static void main(String[] args) {

            Account account1 = new Account("Olukayode", 3000.89);

            System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());

            Scanner input = new Scanner(System.in);

            System.out.println("Enter Amount to Withdraw: ");

            double withdrawalAmount = input.nextDouble();

            System.out.printf("%n About to withdraw %.2f from account ", withdrawalAmount);
            account1.withdraw(withdrawalAmount);
            System.out.printf("%s Current balance is: $.2f%n", account1.getName(), account1.getBalance());

        }
}