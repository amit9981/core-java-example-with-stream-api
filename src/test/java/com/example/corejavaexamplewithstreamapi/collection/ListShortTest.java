package com.example.corejavaexamplewithstreamapi.collection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class
ListShortTest {


    @DisplayName("Ascending")
    @Test
    void sortingAscendingByJava8 ( ) {
        final List<String> main = ListShort.main();
        System.out.println("Before: "+main);
        ListShort.sortingAscendingByJava8(main);
        System.out.println("After: "+main);
    }

    @DisplayName("Ascending")
    @Test
    void sortingDecendingByJava8 ( ) {
        final List<String> main = ListShort.main();
        System.out.println("Before: "+main);
        ListShort.sortingDecendingByJava8(main);
        System.out.println("After: "+main);
    }
    @DisplayName("Ascending  and Descending ")
    @Test
    void ascendAndDescendByStream(){
        final List<String> main = ListShort.main();
        ListShort.ascendAndDescendByStream(main);
    }
}