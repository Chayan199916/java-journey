public class MethodOverloading {

    public static void main(String[] args) {
        
        DemoExample obj = new DemoExample();
        obj.showDemo();
        obj.showDemo(5);
        obj.showDemo("Hello");

    }
    
}

class DemoExample{ /// method overloading, static binding, early binding, compile time polymorphism

    public void showDemo(){

        System.out.println("no value taken..");

    }
    public void showDemo(int x){

        System.out.println("int value taken..");

    }
    public void showDemo(String string){

        System.out.println("String value taken..");

    }
}