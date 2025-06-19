package day19_nested_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        // int num = 4;

        for (int num = 1; num <= 10 ; num++) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + num * i);

            }
            System.out.println();
        }
    }
}
