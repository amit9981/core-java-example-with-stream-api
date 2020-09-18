package com.example.corejavaexamplewithstreamapi.interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterCountTest {

    @Test
    void charCount ( ) {
        final String occurrences = CharacterCount.charCount("occurrences");
        System.out.println(occurrences);
    }
}