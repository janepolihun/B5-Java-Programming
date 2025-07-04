package day26_methods;

//import my_util.StringUtil;

import my_util.*;

import static my_util.StringUtil.uniqueChars;

public class UsingStringUtil {
    public static void main(String[] args) {
        // calling a method and passing arg "jaMes"
        System.out.println( StringUtil.fixFormat("jaMes"));
        String courseName = StringUtil.fixFormat("loopcamp");
        System.out.println(courseName);

        System.out.println("=============");
        uniqueChars("loopcamp");

    }
}
