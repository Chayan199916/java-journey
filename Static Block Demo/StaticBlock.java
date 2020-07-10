// public class StaticBlock {

//     static String s = "";
    
//     static{
//         s = "Hello World";
//     }    

//     public static void main(String[] args) {
        
//         System.out.println(s);

//     }
    
// }

public class StaticBlock {
    
    static{
        System.out.println("Hello world in static 1");;
    }    
    static{
        System.out.println("Hello world in static 2");;
    }    

    public static void main(String[] args) {
        
        System.out.println("Hello world in main");

    }
    
}