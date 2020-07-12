

public class StaticInInterface {
    
    public static void main(String[] args) {

        A.show();
        
    }

}

interface A{

    static void show(){ // java 1.8 feature
        System.out.println("showing...");
    }

}

