
public class MarkerInterfaceDemo {
    
    public static void main(String[] args) {
        
        MyClass obj = new MyClass();
        if(obj instanceof Demo){
            obj.show();
        }else{
            System.out.println("You can't use this...");
        }

    }

}

interface Demo{}  // Marker interface 

class MyClass{

    public void show(){
        System.out.println("Showing...");
    }

}