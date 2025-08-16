package day45_functions_stream.functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class UseFunction {
    public static void main(String[] args) {
        Function < int [], List<Integer> > convertArrToLIst = (int[]arr) -> {
            List <Integer> list  = new ArrayList<>();

            for (int each : arr)
                list.add(each);
            return list;
        };

        int [] arrNum = {1,2,3,4,5};
        List <Integer> l = convertArrToLIst.apply(arrNum);
        System.out.println(l);

        System.out.println("===========================");
        //System.out.println(UtilityFunctions.convertArrToLIst.apply(arrNum));



    }


}
