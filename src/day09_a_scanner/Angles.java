package day09_a_scanner;

/*
    Write a program that asks the user to enter 3 angle numbers ( can be decimal numbers )
    Determine if the angles make a triangle,
        which means the angles add to 180.0
    and Determine if the angles make a circle,
        which means the angles add to 360.0
 */

import java.util.Scanner;

public class Angles {
    public static void main(String []  args ){

        // # 2- Create Scanner Object
        Scanner keybord = new Scanner (System.in);

        System.out.println("Please, enter 3 angles:");
        double angle1 = keybord.nextDouble();
        double angle2 = keybord.nextDouble();
        double angle3 = keybord.nextDouble();

        // if all angles ADD up to 180, it is triangle
        double sumOfAngles = angle1 + angle2 + angle3;

        boolean isTriangle = sumOfAngles == 180.0;
        // if all angles ADD up to 360. it is circle

        boolean isCircle = sumOfAngles == 360.0;

        System.out.println("Is it a triangle " + isTriangle);
        System.out.println("Is it a circle " + isCircle);






    }
}
