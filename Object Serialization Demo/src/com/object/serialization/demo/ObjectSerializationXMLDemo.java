package com.object.serialization.demo;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
// import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ObjectSerializationXMLDemo {
    
    public static void main(String[] args) throws Exception {
        
        try{

            Student s1 = new Student();
            Student s2 = new Student();
            s1.setName("Bob");
            s2.setName("Molie");
            s1.setRoll(12);
            s2.setRoll(13);
            List<Student> students = new ArrayList<Student>();
            students.add(s1);
            students.add(s2);
            College c = new College();
            c.setStudents(students);
            
            // System.out.println(c.getStudents());
    
            // File f = new File("CollegeStudentsInfo.xml");
            XMLEncoder xe = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("CollegeStudentsInfo.xml")));
            xe.writeObject(c);
            xe.close();

        }catch(Exception e){

            System.out.println(e);

        }

    }

}

