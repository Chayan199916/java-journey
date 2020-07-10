public class EncapsulationDemo {

    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setRollNo(12);
        s2.setRollNo(10);
    
        s1.setName("Chayan");
        s2.setName("Manjistha");

        System.out.println(s1.getName());
        System.out.println(s2.getName());

    }
    
}

class Student{

    private int rollno;
    private String name;

    public void setRollNo(int rollno){

        this.rollno = rollno;

    }
    public void setName(String name){

        this.name = name;

    }
    public int getRollNo(){

        return rollno;

    }
    public String getName(){

        return name;

    }

}