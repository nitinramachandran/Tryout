package com.nix.tryout.funcpgming.students;

import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Nitin", "Ramachandran");
        Student student2 = new Student(2, "Ritika", "Kapoor");
        Student student3 = new Student(3, "Siddhant", "Nitin");

        Marks marks1 = new Marks("Maths", 90, student1);
        Marks marks2 = new Marks("Science", 80, student2);
        Marks marks3 = new Marks("Social", 70, student3);

        List<Marks> marksList = List.of(marks1, marks2, marks3);
        StudentService studentService = new StudentService();
        System.out.println("Manual marks: " + marksList);
        List<Marks> marksFromService = studentService.getMarks(student1.getRollNumber());
        System.out.println("Service marks: " + marksFromService);

    }
}
