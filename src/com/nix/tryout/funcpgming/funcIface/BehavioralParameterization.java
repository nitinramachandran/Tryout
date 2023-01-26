package com.nix.tryout.funcpgming.funcIface;

import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class BehavioralParameterization {
    public static void main(String... args) {
        List<Integer> numbers = List.of(12, 8, 13, 4, 6, 2, 4, 12, 15);

/*        System.out.println("Even Squared : ");
        filterAndPrint(numbers, x -> x%2 == 0, x -> x * x);
        System.out.println("Odd Squared : ");
        filterAndPrint(numbers, x -> x%2==1, x -> x * x);*/

//      Supplier
//      Supplier<Integer> supplier = () -> 2;
/*
        Supplier<Integer> supplier = () -> {
            Random rand = new Random();
            return rand.nextInt(10000);
        };
        System.out.println(supplier.get());

        UnaryOperator<Integer> unaryOpr = x -> x * x * x;
        System.out.println(unaryOpr.apply(3));
*/

        numbers.stream()
                .map(MathUtil::multipleAndDivideByTwo)
                .forEach(System.out::println);
    }

    public static void filterAndPrint(List<Integer> numbers, Predicate<? super Integer> predicate, Function<Integer, Integer> functionParam) {
        numbers.stream()
                .filter(predicate)
                .map(functionParam)
                .forEach(System.out::println);
    }


}
