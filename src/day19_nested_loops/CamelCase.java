package day19_nested_loops;

import java.util.Scanner;

/*/*
Camel Case

            Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

            Ex:

                Today is SUNDAY

                Output:

                todayIsSunday

 */
public class CamelCase {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter multiple words in a sentence: ");
        String sentence = key.nextLine().trim().toLowerCase();
        String camelCaseVersion = "";

        /*
        find a space and take the next char and make it bigger
        all rest has to lowercase
         */

        for( int i = 0; i < sentence.length(); i++) {

            if (sentence.charAt(i) == ' '){
                camelCaseVersion +=  ("" + sentence.charAt(i+1)).toUpperCase();
                i++;
            } else {
                camelCaseVersion += sentence.charAt(i);
            }
        }
        System.out.println(camelCaseVersion);
        System.out.println("=============");
        System.out.println("------------------------------------------------");
        // OPTION 2
        String camelCaseVersion2 = sentence.charAt(0)+"";  // today_Is_Sunday

        //  today is sunday --- > todayIsSunday
        for (int i = 1; i < sentence.length(); i++) {

            if (sentence.charAt(i-1) == ' '){ // t == ' '
                camelCaseVersion2 += (""+sentence.charAt(i)).toUpperCase();
            } else {   //  012345678901234

                camelCaseVersion2 += sentence.charAt(i);
            }

        }

        System.out.println(camelCaseVersion2.replace(" ", ""));


    }
}



