package day10_if_statements;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter the temperature: ");
        int temperature = input.nextInt();
        //above or equal to 70
        if (temperature >= 70){

            System.out.println("Its a nice day");
            System.out.println("go outside, but with your laptop to code java");
        }else{
            System.out.println("Its too cold");
            System.out.println("Code more java");
        }


    }
}
