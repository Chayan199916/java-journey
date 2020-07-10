
public class MultilevelInheritance {

    public static void main(String[] args) {
        
        AddSubMulti obj = new AddSubMulti();
        obj.num1 = 5;
        obj.num2 = 4;
        obj.Multi();
        System.out.println(obj.result);

    }
    
}


class AddAgain{

    int num1, num2, result = 0;

    public void sum(){
        result = num1 + num2;
    }

}

class AddSubAgain extends AddAgain{

    public void sub(){
        result = num1 - num2;
    }

}

class AddSubMulti extends AddSub{

    public void Multi(){

        result = num1 * num2;

    }

}