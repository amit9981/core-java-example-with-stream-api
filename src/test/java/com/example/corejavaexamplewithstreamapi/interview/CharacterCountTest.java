package com.example.corejavaexamplewithstreamapi.interview;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class CharacterCountTest {

    @Test
    void charCount ( ) {
        final String occurrences = CharacterCount.charCount("occurrences");
        System.out.println(occurrences);
    }
    
}