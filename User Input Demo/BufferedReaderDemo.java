import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.lang.Exception;

public class  BufferedReaderDemo{

    public static void main(String[] args) throws Exception{
        
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        int i = Integer.parseInt(br.readLine());
        System.out.println(i);

    }
    
}