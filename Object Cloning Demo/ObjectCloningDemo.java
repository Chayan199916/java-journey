
public class ObjectCloningDemo {

    public static void main(String[] args) throws CloneNotSupportedException{
        
        // Shallow Copy

        // Demo obj = new Demo();
        // obj.i = 5;
        // obj.j = 6;
        // Demo obj1 = obj;
        // obj1.j = 7;
        // System.out.println(obj);
        // System.out.println(obj1);

        // Deep Copy

        // Demo obj = new Demo();
        // obj.i = 5;
        // obj.j = 6;
        // Demo obj1 = new Demo();
        // obj1.i = obj.i;
        // obj1.j = obj.j;
        // obj1.j = 7;
        // System.out.println(obj);
        // System.out.println(obj1);

        // Cloning

        Demo obj = new Demo();
        obj.i = 5;
        obj.j = 6;
        Demo obj1 = (Demo)obj.clone(); // typecasting from object class to Demo class
        obj1.j = 8;
        System.out.println(obj);
        System.out.println(obj1);

    }
    
}

class Demo implements Cloneable{ // Cloneable is marker interface, for security purpose

    int i, j;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return i + ", " + j;
    }

    @Override
    public Object clone() throws CloneNotSupportedException { // this throws suppresses super.clone()'s exception
        // TODO Auto-generated method stub
        return super.clone();
    }

}