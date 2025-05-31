package day09_a_scanner;

import java.util.Scanner;

public class DivisibleBy {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please, enter a number: ");
        int number = keyboard.nextInt();

        boolean isEvenlyDivisibleBy2 = number % 2 ==0;
        boolean isEvenlyDivisibleBy3 = number % 3 ==0;
        boolean isEvenlyDivisibleBy5 = number % 5 ==0;

        boolean isEvenlyDivisible2_3_5 = isEvenlyDivisibleBy2 && isEvenlyDivisibleBy3 && isEvenlyDivisibleBy5;

        System.out.println(number + " is evenly divisible by 2 and 3 and 5: " + isEvenlyDivisible2_3_5);

        // if the number divisible with eiter 2 or 5 or 3

        boolean isEvenlyDivisible2or3or5 = isEvenlyDivisibleBy2 || isEvenlyDivisibleBy3 || isEvenlyDivisibleBy5;
        System.out.println(number + " is evenly divisible by 2 or 3 or 5: " + isEvenlyDivisible2or3or5);




    }

}
