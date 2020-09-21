package com.example.corejavaexamplewithstreamapi.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class OptionalExampleTest {

    List<Optional<String>> listOfOptionals = Arrays.asList(
            Optional.empty(), Optional.of("foo"), Optional.empty(), Optional.of("bar"));

    @Test
    void getOptionalList () {
        Collection<Integer> number
                = IntStream.range(0, 10).boxed().collect(Collectors.toList());
        final List<String> list = OptionalExample.getList(listOfOptionals);
        System.out.println(list);
    }
}