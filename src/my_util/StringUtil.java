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

    /**
     * This method returns the single characters
     *
     *
     */
    public class UniqueCharacters {

        public static String uniqueChar(String str){
            String unique = " ";
            char [] strArr = str.toCharArray();
            for(char each :strArr){
                if (!unique.contains(each+"")){
                    unique += each;
                }
            }
            return unique;
        }}


}

