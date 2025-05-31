package day11_if_statement;

public class Ternary {
    public static void main(String[] args) {
        int a = 71;
        String result;
// Op 1 - with regular if statement
        if (a % 2 == 0){

            result = "Even";
        } else {
            result = "Odd";
        }
        System.out.println(result);

        // op 2 - with TERNARY
        //               (condition) ? trueValue : falseValue
        String result2 = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println(result2);
        /*
        RULES
             - When you assign the result of the TERNARY to a variable, the DATATYPE of the values has to SAME and match to the variables DATA
             - When you use the result of the TERNARY in PRINT statement, the DATATYPE of the values DOES NOT have to be SAME
         */

        System.out.println("----------------");
        System.out.println((5 > 2) ? "5 is bigger than 2" : -100);
        if (5 > 2){
            System.out.println("5 is bigger than 2");
        } else {
            System.out.println(-100);
        }

    }
}
