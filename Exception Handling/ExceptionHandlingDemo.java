import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandlingDemo {

    public static void main(String[] args) /* throws IOException */ {

        // RuntimeException Handling
        // try {

        // int i = 5 / 0;

        // // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // // br.close();

        // System.out.println("I won't be executed because it has aready left this
        // block");

        // } catch (ArithmeticException e) {
        // // TODO: handle exception

        // System.out.println("Can't divide by zero..");
        // // e.printStackTrace();

        // } finally {

        // System.out.println("Thank you!");

        // }

        // Try with resources

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int num = Integer.parseInt(br.readLine());
            System.out.println(num);

        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        // own exception handling

        try {

            int item = User input
            if (item <= items * 5 / 100){
                then i will allow
            }else {
                throw new 
            }
            if (i > 0) {

                throw new MyException("Max value can't cross zero!");

            }

        } catch (MyException e) {

            System.out.println(e);

        }

    }
}

class MyException extends Exception { // user defined exception

    public MyException(String s) {
        super(s);
    }

}