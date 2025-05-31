package day09_a_scanner;
/*

    Write a program that asks the user to enter
        a price
        and quantity

        and then calculate the revenue. revenue = price × quantity.
 */

import java.util.Scanner;

public class Revenue {

    public static void main(String[] args) {


        // Create Scanner object
        Scanner key = new Scanner(System.in);

        System.out.print("Please, enter price for item $");
        double price  = key.nextDouble(); // Taking value from user and assigning a variable called price.

        System.out.print("Please, enter quantity for the item: ");
        int quantity = key.nextInt();

         double revenue = price * quantity; // double * int --> double;

        System.out.println("Revenue value: $" + revenue);


    }
}
