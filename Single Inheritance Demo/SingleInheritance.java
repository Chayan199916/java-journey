public class SingleInheritance {

    public static void main(String[] args) {
        
        AddSub obj1 = new AddSub();
        obj1.num1 = 10;
        obj1.num2 = 15;
        obj1.sum();
        System.out.println(obj1.result);

        obj1.sub();
        System.out.println(obj1.result);

    }
    
}

class Add{

    int num1, num2, result = 0;

    public void sum(){
        result = num1 + num2;
    }

}

class AddSub extends Add{

    public void sub(){
        result = num1 - num2;
    }

}