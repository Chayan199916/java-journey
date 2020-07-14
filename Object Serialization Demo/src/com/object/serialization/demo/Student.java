package com.object.serialization.demo;

public class Student {

	private int roll;
    private String name;
    
    public Student(){}
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getRoll() {
        return roll;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "(" + roll + ", " + name + ")";
    }


}
