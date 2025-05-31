package day10_if_statements;
//If using a class from a different package we need to import that package
import java.util.Scanner;

public class EvenOrOddWithSingleIfStatement {

    public static void main(String[] args) {
        // Crated a Scanner Object
        // Scanner key               -> Object Reference
        //new Scanner(System.in);    -> object

        Scanner key = new Scanner(System.in);
        // byte userNumber = (byte)key.nextInt(); //explicit casting
        System.out.print("Please, enterr a number: ");
        int userNumber = key.nextInt();

        boolean isEven = userNumber % 2 == 0;
        boolean isOdd = userNumber % 2 != 0;

        if(isEven){
            System.out.println(userNumber + " is even!");
        }

        if(isOdd){
            System.out.println(userNumber + " is odd!");
        }




    }


}
