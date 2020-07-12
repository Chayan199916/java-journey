
// 1. Single abstract method
// 2. Marker interface

public class Interface {

    public static void main(String[] args) {
        
        // A obj = new A(){
        //     public void show(){
        //         System.out.println("Showing...");
        //     }
        // };
        A obj = () -> System.out.println("Showing..."); // lambda expression
        obj.show();
    }
    
}

interface A{  // sam

    void show();

}

interface B{

    void display();

}

// class C implements A, B{

//     public void show(){
//         System.out.println("Showing...");
//     }
//     public void display(){
//         System.out.println("Displaying...");
//     }

// }