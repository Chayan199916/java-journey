package com.object.serialization.demo;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class ObjectDeserializationXMLDemo {

    public static void main(String[] args) {
        
        try{

            File f = new File("CollegeStudentsInfo.xml");
            XMLDecoder xd = new XMLDecoder(new BufferedInputStream(new FileInputStream(f)));
            College c = (College)xd.readObject();
            List<Student> students =  c.getStudents();
            System.out.println(students);
            xd.close();

        }catch(FileNotFoundException e){
            System.out.println(e);
        }

    }
    
}