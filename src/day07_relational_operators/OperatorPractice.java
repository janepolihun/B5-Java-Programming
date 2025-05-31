package day07_relational_operators;

public class OperatorPractice {

    public static void main( String [] args ){

       int b = 12;
       b++; // POST Increment: b = b + 1; b = 13;

        System.out.println(b); // b = b + 1; b  = 14;


        b--; // POST Decrement: b = b - 1: b = 13;
        System.out.println(b);

        System.out.println("-------------");

        System.out.println(b++); // POST Increment (UPDATE) + Print(USE)
        //print(use) - > 12
        //update ---> b = 13;
        System.out.println(b);

        System.out.println(++b); // PRE Increment UPDATE + Print(USE)
        // 1. update
        // 2. print (use) -> 14
        System.out.println(b);

        System.out.println("-------------");

        System.out.println(b--);
        //1. print (use) -> 14;
        //2. update --> b = 13;

        System.out.println(b);

        System.out.println(--b);
        //1. update - > b = 12;
        //2. print -> use = 12

        System.out.println(b);





    }
}
