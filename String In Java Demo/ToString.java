
public class ToString {

    public static void main(String[] args) {
        
        Person p1 = new Person(12, "Alie");
        System.out.println(p1);


    }
    
}

class Person{

    private int age;
    private String name;

    Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {

        return "Person(" + age + "," + name + ")";
        
    }

}