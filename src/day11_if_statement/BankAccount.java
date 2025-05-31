package day11_if_statement;

import java.util.Scanner;

/*
    Task: Hard code -> Dynamic

    Create a double value for the account balance. // 100
    Create a double value for how much you want to withdraw // 500

    Check the balance after the withdrawal
        if you tried to withdraw more money than you had in the account add a negative overdraft fee to the balance: -100

    In both cases print the remaining balance after withdrawing, with overdraft free applied if you went over

 */
public class BankAccount {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        // I declare two double variables.
        double balance;
        double withdraw;

        System.out.println("What is your balance: ");
        balance = scanner.nextDouble(); //100

        System.out.print("How much money do you want to withdraw: $");
        withdraw = scanner.nextDouble(); // 200

        // 100 - 10 = 90
//        balance -= withdraw;
//        System.out.println("Your new balance is: $");

        //Lets say now, I want to withdraw more than my remaining balance
        // if withdraw is bigger than balance -> print " Not enough Balance"
        // Otherwise, allow withdrawing and update the remaining balance and print " Your new balance is: "

        if(balance >= withdraw){
            //balance = balance - withdraw
            balance -= withdraw;
            System.out.println("Your new balance is: $" + balance);
        }else{
            System.out.println("Not enough balance.");
        }
    }
}
