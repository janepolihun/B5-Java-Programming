package day15_string;

import javax.xml.transform.Source;
import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter a sentence: ");
        String sentence = key.nextLine();

        //Get the first and last character
        System.out.println("First char: " + sentence.charAt(0));
        System.out.println("Last Char: " + sentence.charAt((sentence.length() - 1)));

        //Check if those characters are same or not (ignoring case sensitiveness)

        if (sentence.charAt(0) == (sentence.length() - 1)){
            System.out.println("Same");
        } else {
            System.out.println("Different");

        }


        // Ternary:

    }
}
