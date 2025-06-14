package day18_loops;
/*
    Task:
        declare and assign a number

        print all the multiplication results for 1 through 10

        Ex:
            4

            4 x 1 = 4
            4 x 2 = 8
            4 x 3 = 12
            4 x 4 = 16
            ..
            4 x 10 = 40
 */
public class MultiplicationTable {
    public static void main(String[] args) {

        int num = 3;

        System.out.println(num + " x " + 1 + " = "+ num * 1 );


        System.out.println("-----------------------");
        for(int i = 1; i<= 10; i++){
            System.out.println(num + " x " + 1 + " = "+ num * 1 );
        }
    }

}
