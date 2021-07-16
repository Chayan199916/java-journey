
public class AbstractionDemo {

    public static void main(String[] args) {

        Person3 obj = new Person3();
        obj.drive();
        obj.fly();
        obj.swim();
        obj.restricted(); // This can only be accessed if type of object is of the class where it has been
                          // defined.

    }

}

abstract class Person1 {

    public abstract void drive();

    public abstract void fly();

    public abstract void swim();

}

abstract class Person2 extends Person1 {

    public void drive() {

        System.out.println("Driving...");

    }

    public void fly() {

        System.out.println("Flying...");

    }

    public abstract void swim();

}

class Person3 extends Person2 {

    public void swim() {

        System.out.println("Swiming...");

    }

    public void restricted() {

        System.out.println("Restricted...");

    }

}