package day04_variables;

public class Fruits {
    public static void main(String[] args) {
        int appleCount = 80;
        int grapeCount = 100;
        int bananaCount = 150;

        //System.out.println("This is are many apples we have:" + appleCount);
        System.out.println("This is are many apples we have: 80" ); // Hard coding - using static val

        System.out.println("I have sold 50 apples");
        appleCount = 80 - 50; // reassigned new value
        System.out.println("This is how many apples left " + appleCount);
        System.out.println();



        int applePrice = 15;
        // This price of my 30 apples is $15
        // System.out.println("TThis price of my 30 apples is $15);
        System.out.println("This price of my " + appleCount + " apples is $" +  applePrice); // dynamically used the data

        //CONCATENATION --> after first double qoutation, everything is put next to each other
        // ---- > After concatenation ( or including concatenation)  --> everything become LETTER data type (String)
        System.out.println(10 + 10);// NO double quatation in this code
        System.out.println("" +10 +10); //1010
        System.out.println(10 + 10 + "" + 10 + 10); // 201010
        System.out.println("" + 10 + 10 + "" + 10 + 10); // 10101010
        System.out.println("ab" + 10 + 10 + "" + 10 + 10); // ab10101010
        System.out.println("ab" + 10 + 10 + 10 + 10); //
        System.out.println("" + 10 + 10 + "  " + 10 + 10); // 1010  1010
        System.out.println(10 + 10 + "  " + 10 + 10); // 20  1010

        System.out.println("" + (10 + 10)); // "20"

        // 4 * 3 + 2 = 14
        // 4 * (3 + 2) = 20









    }


}
