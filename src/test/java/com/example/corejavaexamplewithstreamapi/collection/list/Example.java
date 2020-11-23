package com.example.corejavaexamplewithstreamapi.collection.list;


import org.junit.jupiter.api.Test;

import java.util.List;

public class Example {

    @Test
    void list ( ) {
        final List<Integer> integers = List.of(1, 2, 3, 4, 5, 5, 6);
        integers.stream().forEach(Example::listOf);
    }

    @Test
    void listReduce ( ) {
        final List<Integer> integers = List.of(1, 2, 3, 4, 5, 5, 6);
        //  final Integer reduce = integers.stream().reduce(0, (a, b) -> (a + b));
        final Integer reduce = integers.stream().reduce(0, Example::sum);
        System.out.println(reduce);
    }

    @Test
    void listEven ( ) {
        final List<Integer> integers = List.of(1, 2, 3, 4, 5, 5, 6);
        integers.stream()
                // .filter(Example::listEven)
                .filter(number -> number % 2 == 0)
                .forEach(Example::listOf);
    }

    private static void listOf (Integer of) {
        System.out.println(of);
    }

    private static boolean listEven (Integer of) {
        return of % 2 == 0;
    }

    private static int sum (int a, int b) {
        return a + b;
    }

}
