package day04_variables;

public class ShoppingReceipt {
    public static void main( String[] args){
       /*
Create a class called ShoppingReceipt
Create a main method
Output this exactly:


    ****************************
        WELCOME TO THE STORE
    ****************************

    -------------------------

    Cake     $24
    Water        $3.99
    Apple Juice    $7.50
    Bread        $4.25

    -------------------------
    TOTAL AMOUNT:     $39.74
    TAX:              $3.90

    GRAND TOTAL:      $43.64
    -------------------------
    *******THANK YOU*********
 */


                System.out.println("****************************");
                System.out.println("\tWELCOME TO THE STORE");
                System.out.println("****************************");
                System.out.println(); // for empty line
                System.out.println("-------------------------");

                // The below code is doing the exact same thing as the one above but with SINGLE println statement
                //System.out.println("****************************\n\tWELCOME TO THE STORE\n****************************\n\n-------------------------");
                System.out.println();
                System.out.println("Cake\t\t\t$24");
                System.out.println("Water\t\t\t$3.99");
                System.out.println("Apple Juice\t\t$7.50");
                System.out.println("Bread\t\t\t$4.25");

                System.out.println();

                System.out.println("-------------------------");

                System.out.println("TOTAL AMOUNT:\t$39.74");
                System.out.println("TAX:\t\t\t$3.90");
                System.out.println();
                System.out.println("GRAND TOTAL:\t$43.64");
                System.out.println("-------------------------");
                System.out.println("*******THANK YOU*********");

            }
        }
