public class StaticKeyword {

    public static void main(String[] args) {
        
        Abc.i = 10;
        Abc.show();

    }
    
}

class Abc{

    static int i;
    public static void show(){
        System.out.println(i);
    }

}