import java.util.ArrayList;

// Integer, Float, Double, Character

public class WrapperClassDemo {

    public static void main(String[] args) {

        int i = 5, j;
        // Integer ii = i;
        Integer ii = Integer.valueOf(i); // wrapper class // (boxing) // j = ii (autoboxing)
        j = ii.intValue(); // (unboxing) // j = ii (autounboxing)
        System.out.println(j);

        ArrayList<Integer> arr = new ArrayList<Integer>(); // use of wrapper class
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);

        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();
        arr.forEach((ele) -> System.out.print(ele + " "));

    }

}