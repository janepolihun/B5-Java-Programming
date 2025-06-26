package day22_arrays;

import java.io.PrintStream;
import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {
        String str = "monday tuesday thursday friday saturday sunday";
        System.out.println("String size: " + str.length());

       String [] days =  str.split(" ");
        System.out.println(Arrays.toString(days));
        System.out.println("Array size: " + days.length);

        System.out.println("==========================");
        String [] days2 = str.split("day");
        System.out.println(Arrays.toString(days2));
        String [] days3 = str.split("day ");
        System.out.println(Arrays.toString(days3));

        System.out.println("===========================");
        String [] days4 = str.split("");
        System.out.println(Arrays.toString(days4));

        char [] days5 = str.toCharArray();
        System.out.println(Arrays.toString(days5));

        System.out.println("=========================");
        String [] day6 = str.split("-");
        System.out.println(Arrays.toString(day6));

    }
}
