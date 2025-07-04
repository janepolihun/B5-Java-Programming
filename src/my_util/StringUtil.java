package my_util;

public class StringUtil {
    public static String fixFormat (String str) {
        String fixed = "";

        /*
            first char to uppercase
            rest is lowercase
         */

        fixed = (""+str.charAt(0)).toUpperCase() + str.substring(1).toLowerCase();

        return fixed;
    }


    /**
     * This metho counts the letter appearance in word
     * @param word is the String
     * @param letter is the given char
     * @return count of char in String
     */

    public static int frequencyOfChar(String word, char letter){
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter){
                count++;
            }
        }
        return count;
    }




        public static String uniqueChars (String str) {
            String unique = "";
            char []  strArr = str.toCharArray();

            // foreach ---  >we can only use with data structures
            for ( char each: strArr){ // [l, o, o, p, c, a, m, p ]

                if (!unique.contains( each+"" )) {
                    unique += each;  // lopcam
                }

            }

            return unique;
        }

    public String reverse (String str) {
        String reversed = "";
        for (int i = str.length() - 1 ; i >= 0; i--) {
            reversed += str.charAt(i);

        }
        return reversed;
    }
}




