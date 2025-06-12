package day15_string;


import java.util.Locale;
import java.util.Scanner;

public class TernaryExample {
    public static void main(String[] args) {

        // condition ? trueResult : falseResult;

        System.out.println(   5 < 3 ? "green" : 9 < 20 ? "yellow" : "brown" );
        //                     5 < 3 ? "green" : "yellow"

        if  (5 < 3){
            System.out.println("green");
        } else {
            if (9 < 20){
                System.out.println("yellow");
            } else {
                System.out.println("brown");
            }
        }


        System.out.println("--------------------------------------------------");

        System.out.println( 6 < 7 ? 12 > 10 ? "black" : "white" : "orange");

        if (6 < 7) {
            if (12 > 10) {
                System.out.println("black");
            }else {
                System.out.println("white");
            }
        } else {
            System.out.println("orange");
        }

        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter your text: ");
        String sentence = key.nextLine();

        System.out.println(sentence.length());
        String lastCharacter = "" + sentence.charAt( sentence.length() - 1 );
        String beforeLastChar = "" + sentence.charAt( sentence.length() - 2 );

        System.out.println(sentence.charAt( sentence.length() - 1));
        System.out.println(sentence.charAt( sentence.length() - 2));




        if (lastCharacter.equals(beforeLastChar)) {

            System.out.println("The two last letter are the same." );
        } else {
            System.out.println("The two last letter are the different." );
        }





    }
}
