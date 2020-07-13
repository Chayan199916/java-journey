import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandlingDemo {
    
    public static void main(String[] args) throws IOException{
        
        // RuntimeException Handling
        try {
            
            int i = 5 / 0;


        } catch (ArithmeticException e) {
            //TODO: handle exception

            System.out.println("Can't divide by zero..");

        }
        finally{

            System.out.println("Thank you!");

        }

        // Try with resources

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            int num = Integer.parseInt(br.readLine());

        }
        
        // own exception handling

        try{

            int i = 6;
            if(i > 0){

                throw new MyException("Max value can't cross zero!");

            }

        }catch(MyException e){
            
            System.out.println(e);

        }

    }

}

class MyException extends Exception{ // user defined exception

    public MyException(String s){
        super(s);
    }

}