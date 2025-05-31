package day07_relational_operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        int a = 10; //declare and initialized ( first value ) variable called a;
        a = 20;     // re-assigned variable ' a ' into new value
        a++;        // re-assigned by P0OST INCREMENT ( increasing value by 1) -> a = a(20) + 1;
        ++a;        // re-assigned by PRE INCREMENT (  increasing value by 1)--> a
        a = a + 1;  // re-assigned by increasing value by 1


        a = a + 10; // re-assigned by increasing/adding by 10;
        System.out.println(a);
        a += 10;   // re-assigned by shortHand operator adding 10 --> a = a(33) + 10; a = 43;
        System.out.println(a);
        System.out.println();

        a = 100 + 10; // SHORTHAND operator when you add/minus/multi/ TO ITSELF;

        int b = 10;
        b *= 2;         // re-assigned by using SHORTHAND operator multiplying itself by 2
        // b = b * 2;
        System.out.println(b);
        System.out.println();


        int c = 20;
        c -= 5;         // re-assigned by using SHORTHAND operator minusing itself by 2
        // c = c - 5;
        System.out.println(c);
        System.out.println();


        int d = 5;
        d /= 2;         // re-assigned by using SHORTHAND operator dividing itself by 2
        // d = d / 2;
        System.out.println(d);
        System.out.println();


        int e = 7;
        e %= 2;         // re-assigned by using SHORTHAND operator moduling itself by 2
        // e = e % 2;
        System.out.println(e);










    }
}
