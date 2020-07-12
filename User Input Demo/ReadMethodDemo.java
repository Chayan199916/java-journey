
public class ReadMethodDemo {

    public static void main(String[] args) throws Exception{
        
        String s = "";
        int i;
        System.out.println("Enter a string...");
        while((i = System.in.read()) != 48){
            
            s += (char)i;

        }

        System.out.println(s);

    }
    
}