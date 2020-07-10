public class SuperKeyword {
    
    public static void main(String[] args) {
        
        Child obj = new Child(5, 6);
        obj.show();

    }

}

class Parent{

    int i;

    public Parent(){}
    public Parent(int i){

        this.i = i;

    }
    public void show(){

        System.out.println(i);

    }
}

class Child extends Parent{

    int j;

    public Child(){}
    public Child(int i, int j){

        super(i);
        this.j = j;

    }
    public void show(){

        super.show();
        System.out.println(j);

    }

}