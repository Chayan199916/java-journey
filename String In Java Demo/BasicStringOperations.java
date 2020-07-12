import java.util.Scanner;

public class BasicStringOperations {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings : ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(s1 + " " + s2);
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        sc.close();

    }

}
