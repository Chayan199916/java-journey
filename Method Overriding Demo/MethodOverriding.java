public class MethodOverriding {

    public static void main(String[] args) {
        
        A obj = new B(); // late binding, runtime polymorphism, method overriding, Dynamic method dispatch (It decides at runtime)
        obj.show();

    }
    
}

class A{
    public void show(){
        System.out.println("In A");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B");
    }
}