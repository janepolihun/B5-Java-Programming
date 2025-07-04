package day25_methods;
/*
make the method thet returns the single characters of each in the String
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
    }

    public static void main(String[] args) {
        uniqueChar("loopcamp");
    }

}
