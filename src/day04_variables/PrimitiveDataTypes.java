package day04_variables;
/*
Primitive Data Types
        WHOLE NUMBERS / INTEGER TYPE:       byte, short, int, long     - > if you use data directly, Java takes it as "int" by default
        DECIMAL NUMBERS / FLOATING TYPE:    float, double

*/


public class PrimitiveDataTypes {
    public static void main( String[] args){
//        Declaring variable --> Datatype VariableName;
//        If you know container will hold WHOLE NUMBERS: byte, short, int, long
//        If you know container will hold DECIMAL NUMBERS: float, double

//        Declaring variable ---> Datatype VariableName;
//        byte age = 10; We CANnot declare the same variable name in same method
//        int age = 10;
//        System.out.println(age); at this line, since variable age does not have value
        byte age;
        age = 10; //In this line, we have - assign initial value (first time giving value) We have initialized variable.
        System.out.println(age); // singe age variable have value in it, my code can print it out.


        System.out.println("age"); // we are printing the DATA itself directly - DATA is letters (String)
        System.out.println(10); // we are printing the DATA itself directly - WHOLE NUMBER (int)
        System.out.println("10"); // we are printing the DATA itself directly - DATA is letters (STRING)

        age = 20; // here we REASSIGNED a new value which 20 to variable "age"
        System.out.println(age);
       // age = 200; // we CANNOT assign a data which is outside of range that byte can hold

        System.out.println();

        // Declaring variable + assigned initial value --- > DataType VariableName = value/data
        short year = 2025;
        System.out.println(year); // short DataType
        System.out.println(2025); // int

        //Declaring variable
        int addressNumber;
        // assigned value/data into variable called addressNumber
        addressNumber = 123456;
        System.out.println(addressNumber); // int
        System.out.println(123456); //int
        System.out.println("123456"); // letters - String



        // Declaring variable
        long creditCardNumber;
        // assigning value / initializing variable
        //creditCardNumber = 1234567891234567l;  // Lowercase L at the end
        creditCardNumber = 1234567891234567L; //Uppercase L at the end


        System.out.println(4234567891234567L); // Since java take the data directly as "int" and since 4234567891234567 is outside of the range that int can hold, we need to follow the syntax and add "L" or "l"




    }
}
