package com.example.corejavaexamplewithstreamapi.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListShort {

    public static List<String> main ( ) {
        List<String> names = new ArrayList<String>();
        names.add("Mahesh ");
        names.add("Suresh ");
        names.add("Ramesh ");
        names.add("Naresh ");
        names.add("Kalpesh ");
        return names;
    }

    public static void ascendAndDescendByStream (List<String> names) {
        System.out.println("Without Sort:" + names);
        System.out.println(names.stream().sorted().collect(Collectors.toList()));
        System.out.println(names.stream().sorted((x, y) -> y.compareTo(x)).collect(Collectors.toList()));
    }

    public static void sortingAscendingByJava8 (List<String> names) {
        Collections.sort(names);
    }

    public static void sortingDecendingByJava8 (List<String> names) {
        Collections.sort(names, (a, b) -> b.compareTo(a));
    }


}
