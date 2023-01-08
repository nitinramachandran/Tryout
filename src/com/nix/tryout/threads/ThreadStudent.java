package com.nix.tryout.threads;


public class ThreadStudent {
    private Integer rollNumber;
    private String name;

    public ThreadStudent(Integer rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }
    public ThreadStudent() {

    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return rollNumber + " " + name + " ";
    }
}
