package day08_scanner_logical_operators;

public class LogicalOperator {

    public static void main(String[] args) {


        //LOGICAL OPERATOR

        //- for determining the range;
        // - getting result for two or more different things with either TRUE or FALSE result;

        int n =  100;
        // 5 < n < 20; ( NOT VALID);
        // Java CANNOT do this way. We use logical operators
        System.out.println( 5 < n);
        System.out.println(n < 20);

        // Java CANNOT do this way. We use logical operators
        //&& ---> AND operator;
        System.out.println( 5 < n && n < 20);

        System.out.println("------------");
        System.out.println(5 < n && n < 20);

        // find if number is between 1 and 10;  --- >  1 < n < 10; -- > 1 < n && n < 10


        System.out.println("------------------------------------");
        System.out.println(6 > 1 && true);
        //                  true && true --- > true
        System.out.println(6 < 1 && true);
        //                  false && true --- > false
        System.out.println(6 > 1 && false);
        //                  true && false --- > false
        System.out.println(6 < 1 && false);
        //                  false && false --- > false



        System.out.println("------------------------------------");
        System.out.println(3>2 || true);
        //                  true || true --- > true

        System.out.println(3<2 || true);
        //                 false || true --- > true

        System.out.println(3>2 || false);
        //                 true || false --- > true

        System.out.println(3<2 || false);




    }
}
