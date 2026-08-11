package com.nix.tryout.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TryLambdaSort {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Arjentina", "Aman", "Austr", "Antarctica");
        // Without using Lambda
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        System.out.println("Without Lambda");
        System.out.println(list);

        System.out.println("With Lambda");

        List<String> list2 = Arrays.asList("Base", "Boy", "Apple", "Cat", "Ant", "Cart", "Camera", "Atlas", "Acres");

        // Using Lambda
        list2.sort((x, y) -> x.compareTo(y));
        System.out.println(list2);
    }
}
