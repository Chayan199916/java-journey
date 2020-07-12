import java.util.Scanner;

public class ScannerDemo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = Integer.parseInt(s);
        int j = sc.nextInt();
        System.out.println(i);
        
    }

}