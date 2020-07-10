public class ObjectPassing {

    public static void main(String[] args) {
        
        Son son = new Son();
        Father dad = new Father();
        son.setMoney(100);
        son.getMoney();
        dad.setMoney(son);
        son.getMoney();

    }
    
}

class Father{

    public void setMoney(Son son){
        son.money += 1000;
    }

}

class Son{

    int money;
    public void setMoney(int m){
        money = m;
    }
    public void getMoney(){
        System.out.println(money);
    }
}