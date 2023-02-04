package com.nix.tryout.funcpgming;

import com.nix.tryout.funcpgming.customclass.FactoryClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FuncCollector {
    public static void main(String... str) {
        var numbers = FactoryClass.getNumberList();
        var names = FactoryClass.getNameList();
        System.out.println(getSquareList(numbers));
        System.out.println(getNameLengthList(names));
    }

    /**
     * Returns the square of each of the values in the list
     * @parameters Integer list of numbers
     * @return Integer list of numbers
     */
    private static List<Integer> getSquareList(List<Integer> numbers) {
        return numbers.stream()
                .map(elt -> elt * elt)
                .collect(Collectors.toList());
    }

    /**
     * Returns the length of the strings as a list
     * @param names as list
     * @return list of numbers
     */
    private static List<Integer> getNameLengthList(List<String> names) {
        return names.stream()
                .map(x -> x.length())
                .collect(Collectors.toList());
    }
}