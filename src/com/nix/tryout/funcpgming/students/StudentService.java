package com.nix.tryout.funcpgming.students;

import java.util.List;

/**
 * Student Class
 */
public class StudentService {

    public Student getStudent(int rollNumber) {
        return new Student(rollNumber, "Nitin", "Ramachandran");
    }

    public List<Marks> getMarks(int rollNumber) {
        return List.of(
            new Marks("Maths", 90, getStudent(rollNumber)),
            new Marks("Science", 80, getStudent(rollNumber)),
            new Marks("Social", 70, getStudent(rollNumber))
        );
    }
}
