package day05_variables;

import javax.xml.transform.Source;

public class CharExample {
    public static void main(String[] args) {

        // declare char data type variable and assign value
        char letter1 = 'a';
        char letter2 = 'Z';
        char letter3 = '$';
        char letter4 = '9';

//        char letter5 = 'AB' // only single character
//        char letter6 = "A": // char cannot hold String value ""

        System.out.println(letter1);
        System.out.println(letter2);
        System.out.println(letter3);
        System.out.println(letter4);


//        System.out.println(letter1 + letter2); // 97 + 98 = 187 --- >
        // a -> 97
        // Z -> 8


        System.out.println("" + letter1 + letter2);

        System.out.println("------------");
         char letter5 = 77;
        System.out.println(letter5);

        int num = 77;
        System.out.println(num);

        System.out.println("------------");
        char letter6 = '1';
        char letter7 = '2';
        System.out.println(letter6 + letter7); // 99





    }
}
