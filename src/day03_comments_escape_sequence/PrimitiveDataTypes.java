package day03_comments_escape_sequence;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
//        I want to have a variable that holds age of the person
     int age; // I DECLARED a variable(container) called "age" which will hold whole number (int)
        age = 20; // I assigned a value 20 to the variable "age"

        int miles = 200; // I DECLARED a variable which will hold whole number

        age = 40;
        System.out.println( age );


        System.out.println("I bought new car with 0 miles ");
        int carMiles = 0;
        System.out.println( carMiles );



        System.out.println( "----------------------------------------------------");
        int year = 2025; // I DECLARED a variable called "year" with data int(whole number) and assigned a value 2025 to it.
        System.out.println(year);
        System.out.println( "year" ); // Here we just print DATA (Letters - String) directly
        System.out.println(2025); // Here we just print the DATA (number - int) directly which has NO RELATION with variable called "year"
        System.out.println( "----------------------------------------------------");



//        byte age; No metter what the data type is we can NOT use the same variable name more one time in the same method.
        byte number = 0;
        System.out.println(number);

        number = -128;
        System.out.println(number);
        number = -127;
        System.out.println(number);

//        number = 128;
//        number = -128;

        System.out.println(number);


        }
}
