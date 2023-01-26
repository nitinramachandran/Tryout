package com.nix.tryout.funcpgming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DistinctSortedFun {
    public static void main(String... arg) {
        printAllNames(List.of("a", "aa", "ab", "abc", "Ab", "deffgf", "gefa", "kererrreer", "ja", "A", "a", "kaeeeweweee", "ak", "k"));
    }

    private static void printAllNames(List<String> strings) {
        strings.stream().sorted().distinct()
                .map(str -> str + "-" + str.length() + "  ")
                .forEach(System.out::print);
    }
}
