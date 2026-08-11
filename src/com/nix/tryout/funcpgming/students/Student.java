package com.nix.tryout.funcpgming.students;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private int rollNumber;
    private String firstName;
    private String lastName;
}
