package day08_scanner_logical_operators;


import java.util.Scanner;

public class FirstScanner {
    public static void main(String[] args) {

        // Scsner input --> ' input' is the object reference name / variable name

        // int a; ----> 'a' is the variable name ( primitive );

        // we declare and instantiated scanner Object
        Scanner input = new Scanner(System.in);


        System.out.print("What is your name: "  );
        // String name = "Tom Jerry";
        String name = input.nextLine();


        System.out.println();
        System.out.println("My name is: " + name);

    }
}
