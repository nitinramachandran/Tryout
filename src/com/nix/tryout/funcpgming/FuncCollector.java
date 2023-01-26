package com.nix.tryout.funcpgming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FuncCollector {
    public static void main(String... str) {
        var numbers = List.of(12, 2, 3, 7, 4, 6, 17, 25);
        var names = List.of("Nitin", "Ritika", "Siddhant", "Sathwick", "Vibha", "Saachi", "Kaaku");
        System.out.println(getSquareList(numbers));
        System.out.println(getNameLengthList(names));
    }

    private static List<Integer> getNameLengthList(List<String> names) {
        return names.stream()
                .map(x -> x.length())
                .collect(Collectors.toList());
    }

    private static List<Integer> getSquareList(List<Integer> numbers) {
        return numbers.stream()
                .map(elt -> elt * elt)
                .collect(Collectors.toList());
    }
}