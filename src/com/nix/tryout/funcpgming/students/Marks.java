package com.nix.tryout.funcpgming.students;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Marks {

    private String subjectName;
    private int marks;
    private Student student;
}
