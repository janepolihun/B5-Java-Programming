package day19_nested_loops;

import java.util.Scanner;
import java.util.SortedMap;

/*
Reverse only second word [String, Loops]

Given a String with three words separated by spaces. Reverse only the second word and return the modified String
    Ex:
    I love java

    Ouput:
    I evol java
 */
public class ReserveMiddle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a sentence with 3 words: ");
        String sentence = input.nextLine().trim(); //I love Java
        int countSpace = 0;
        String copyOfSentence = sentence;

        while (copyOfSentence.contains(" ")){
            countSpace++;
            copyOfSentence = copyOfSentence.replaceFirst(" ", "*");
        }
        if (countSpace == 2){
            int firstSpaceIndex = sentence.indexOf(" ");
            int lastSpaceIndex = sentence.lastIndexOf(" ");
            String middleWord = sentence.substring(firstSpaceIndex,lastSpaceIndex).trim();
           // sentence.substring(firstSpaceIndex,lastSpaceIndex);
            String reverseMiddle = "";
            for (int i = middleWord.length() - 1; i >=0 ; i-- ){
                reverseMiddle += middleWord.charAt(i);
            }
            // System.out.println(reverseMiddle);
            String firstWord = sentence.substring(0,firstSpaceIndex);
            String thirdWord = sentence.substring(lastSpaceIndex+1);

            System.out.println(firstWord + " " + reverseMiddle + " " + thirdWord);
        } else {
            System.out.println("You did not give me 3 words.");
        }
    }


}
