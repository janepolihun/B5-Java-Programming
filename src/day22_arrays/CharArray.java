package day22_arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        String word = "loopcamp";

        System.out.println("Size of word: " + word.length());
        System.out.println("Word: " + word);

        System.out.println("=================");
        char [] letter = {'l','o','o', 'p', 'c', 'a', 'm','p'};
        System.out.println("Size of char arr: " + letter.length);
        System.out.println(letter); // THIS WORKS ONLY WITH char ARRAY
        System.out.println("" + letter); //Memory Location
        System.out.println(Arrays.toString(letter));


        System.out.println("====================");
        char [] wordInArr = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            wordInArr[0] = word.charAt(0);
        }
        System.out.println(Arrays.toString(wordInArr));

        System.out.println("====================");

        char [] wordInArr2 = word.toCharArray();
        System.out.println(Arrays.toString(wordInArr2));

        System.out.println("=====================");

        char [] charArr = "Wednesday".toCharArray();
        System.out.println(Arrays.toString(charArr));


        System.out.println("======================");
        // converting char Array INTO String
        char [] charArr2 = {'J', 'A','V','A' };
        String str1 = Arrays.toString(charArr2);
        System.out.println(str1);

        String str2 = new String(charArr2);
        System.out.println(str2);



    }
}
