
public class FinalKeyword{

    public static void main(String[] args) {
        
    }

}

final class Parent{ // It stops from inheriting

    final int i = 5; // It stops from changing i
    final public void show(){  // It stops from overriding 
        System.out.println("In show A");
    }
}

// class Child extends Parent{

//     public void show(){
        
//     }
    
// }