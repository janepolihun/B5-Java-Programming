package day09_a_scanner;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String [] args){

        //created Scanner object and assigned it onto keyboard object reference
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, enter 3 numbers: ");
        System.out.print("\tNumber 1: ");
        int num1 = keyboard.nextInt();

        System.out.print("\tNumber 2: ");
        int num2 = keyboard.nextInt();

        System.out.print("\tNumber 3: ");
        int num3 = keyboard.nextInt();

        int sumOfAll = num1 + num2 + num3;

        System.out.println("Sum of number: " + sumOfAll);


        int halOfTotal = sumOfAll / 2;
        //System.out.println("Half of the total: " + sumOfAll / 2);
        System.out.println("Half of the total: " + halOfTotal);

        //int afterAdd2 = halOfTotal;
        //afterAdd2 += 2;
        System.out.println("After adding 2: " + (halOfTotal + 2));





    }

}
