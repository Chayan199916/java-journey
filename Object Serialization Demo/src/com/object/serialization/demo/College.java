package com.object.serialization.demo;

import java.io.Serializable;
import java.util.List;

public class College implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Student> students;

    public College(){}
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public List<Student> getStudents() {
        return students;
    }

}