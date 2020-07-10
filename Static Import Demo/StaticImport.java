// import static java.lang.System.out;

// public class StaticImport {

//     public static void main(String[] args) {
        
//         out.println("Hello");

//     }
    
// }
import static root.mypackage.DemoStaticImport.show;
// import root.mypackage.DemoStaticImport;

public class StaticImport{

    public static void main(String[] args) {
        
        // DemoStaticImport.show();
        show();

    }

}