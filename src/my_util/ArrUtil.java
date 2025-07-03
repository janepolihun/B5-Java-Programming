package my_util;

import java.util.Arrays;


public class ArrUtil {
    public static int minNumInArray (int [] nums ) {

        Arrays.sort(nums);

        return nums [0];
    }

    /**
     *
     * @param nums
     * @return
     */
    public static int maxNumInArray (int [] nums ) {

        Arrays.sort(nums);

        return nums [nums.length - 1];
    }
}
