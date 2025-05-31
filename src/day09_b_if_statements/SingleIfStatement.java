package day09_b_if_statements;

public class SingleIfStatement {
    public static void main(String[] args) {

        // Single If Statement - with direct boolean value
        // Condition --> true / false
        if(false) {
            System.out.println("1st print");
        }
            System.out.println("2st print");

        System.out.println("------------------");


        // Single if statement - with relational operators with result in - true/false
        int age= 75;
        if(age >= 75){
            System.out.println("You are a senior citizen");
        }

        if (age < 75) {
            System.out.println("You are a senior citizen");
        }

        System.out.println("---------------");

        // Single if Statement - with logical operator which result in - true/false
        boolean isCitizen = true;
        boolean is18YearOld = age>= 18;

        // Person is only eligible if he/she citizen and least 18 year old.

        if (is18YearOld && isCitizen){
            System.out.println("You are eligible to vote");
            System.out.println("Please, go to the closest voting location to vote");
        }

        if (isCitizen){

            System.out.println("You do not need passport to enter your country ");

        }






    }

}
