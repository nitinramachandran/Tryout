package com.nix.tryout.preps.faangprep;

import java.util.List;

public class LambdaExploration {

    List<String> studentsList;

    public static void main(String... args) {

    }

    public List<String> addStringsToList(List<Student> students) {
        if(studentsList.addAll(
                    students.stream().map(student -> student.getFirstName() + " " + student.getLastName()).toList())) {
                        return studentsList;
                    } else return null;
             //   students.stream().map(student -> student.getFirstName() + " " + student.getLastName() + ".").toList());
    }
}
