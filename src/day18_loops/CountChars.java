package day18_loops;
/*
    Count upper, lower, and numbers
        Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
        Ex:
        Input: 2juMp41EEkd4s4

        Output:
        3 uppercase letters
        6 lowercase letters
        5 numbers
 */
public class CountChars {

    public static void main(String[] args) {

        String str = "2juMp41EEkd4s4";

        int upperCase = 0;
        int lowerCase = 0;
        int number = 0;
        int special = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

            if (65 <= eachChar && eachChar <= 90){
                upperCase++;
            } else if (97 <= eachChar && eachChar <= 122) {
                lowerCase++;

            } else if(48 <= eachChar && eachChar <= 57 ){
                number++;
            } else {
                special++;
            }


        }
        System.out.println("UpperCase letters count " + upperCase);
        System.out.println("LowerCase letters count " + lowerCase);
        System.out.println("Special letter count: " + special);
    }
}
