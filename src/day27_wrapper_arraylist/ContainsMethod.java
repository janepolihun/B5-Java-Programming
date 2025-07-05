package day27_wrapper_arraylist;

import java.util.ArrayList;

public class ContainsMethod {
    public static void main(String[] args) {

        ArrayList <Integer> nums = new ArrayList<>();
        System.out.println(nums.size());

        // .isEmpty()
        System.out.println(nums.isEmpty());
        boolean result = nums.isEmpty();
        System.out.println(result);

        System.out.println("============================");

        nums.add(10);
        System.out.println(nums.isEmpty());
        System.out.println(nums.size());

        // 4.9 * (146) --> "146"
        // nums.add("146")
        nums.add(Integer.valueOf("146"));
        System.out.println(nums);


        System.out.println("============================");

        nums.add(300);
        nums.add(43);
        nums.add(65);
        nums.add(26);

        System.out.println(nums);

        System.out.println("============================");
        // .contains(Element);
        // [10, 146, 300, 43, 65, 26]
        System.out.println(nums.contains(146));
        System.out.println(nums.contains(466));

        

    }
}
