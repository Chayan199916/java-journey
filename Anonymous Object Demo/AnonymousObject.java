
class AnonymousObject{

    public static void main(String[] args) {
        
        // A obj = new A();
        // obj.i = 5;    // garbage collection doesn't work coz of stack ref
        // obj.show();
        new A().i = 5;
        new A().show(); // garbage collection works

    }

}

class A{

    int i;
    public void show(){
        System.out.println(i);
    }

}