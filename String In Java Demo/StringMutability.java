
// String is immutable means whether we use String s = new String(input_string) 
// or String s = input_string, it doesn't change the previous value, in heap it creates another object
// through String pool and basically only the address is change in stack. So to make a string mutable 
// we use either StringBuffer or StringBuilder. Functionality of both are same, only diff is StringBuffer guarrantees synchronization 
// in multithreading(thread-safe), but StringBuilder doesn't,

public class StringMutability {

    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer("Alie");
        sbf.append(" Rounat");
        // sbf.delete(5, 11);
        System.out.println(sbf);

    }

}