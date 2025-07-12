package day30_b_custome_classes;

import java.util.ArrayList;
import java.util.Scanner;

public class AllPeople {
    public static void main(String[] args) {
        String name1;// Local Variable - at Method level

       //  System.out.println(name); // Local variables do NOT have default values;
        // System.out.println(name);
        // System.out.println(age);
        // System.out.println(height);
        // System.out.println(isMarried);
        // System.out.println(hasKids);


        // Reference             =      object
        Scanner key              =      new Scanner(System.in);
        String str               =      new String("Loopcamp");
        ArrayList <String> list  =      new ArrayList<>();
        String [] arr            =      new String [4];


        //
        Person person1           =      new Person();
        Person person2           =      new Person();
        Person person3           =      new Person();
        Person person4           =      new Person();
        Person person5           =      new Person();
        Person person6           =      new Person();
        Person person7           =      new Person();

        System.out.println("======================");
        System.out.println("Person2 Info:");
        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.height);
        System.out.println(person2.isMarried);
        System.out.println(person2.hasKids);


        System.out.println("======================");

        System.out.println("Person1 Info:");
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.height);
        System.out.println(person1.isMarried);
        System.out.println(person1.hasKids);


        //name = Tom
          person1.name = "Tom";
          person1.age = 30;
          person1.height = 5.9;
          person1.isMarried = true;
          person1.hasKids = false;


        //name = James
        person2.name = "James";
        person2.age = 40;
        person2.height = 6.1;
        person2.isMarried = false;
        person2.hasKids = true;

        System.out.println("======================");
        System.out.println("Person2 Info:");
        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.height);
        System.out.println(person2.isMarried);
        System.out.println(person2.hasKids);


        System.out.println("======================");

        System.out.println("Person1 Info:");
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.height);
        System.out.println(person1.isMarried);
        System.out.println(person1.hasKids);

    }
}
