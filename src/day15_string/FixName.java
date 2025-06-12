package day15_string;

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter your name: ");
        String firstName = key.next(); // tom

        System.out.println("Please, enter your last name: ");
        String lastName = key.next();

        System.out.println("---------------");
        System.out.println("You full name (before fix): " + firstName + " " + lastName);

        // .charAt(0); + rest do it in lowercase
        // firstName = ( "" + firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase(); // Option 1
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase(); // Option 2
        //lastName = ( "" + lastName.charAt(0)).toUpperCase() + lastName.substring(1).toLowerCase();// Option 1
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();// Option 2


        System.out.println("Your Full name (after fix: " + firstName + " " + lastName );

        // CodingBat for more practice
    }
}
