package com.example.corejavaexamplewithstreamapi.stream.map;

import com.example.corejavaexamplewithstreamapi.interview.Employee;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class Example {
    public static void main (Map<String, Integer> budget) {
        final LinkedHashMap<String, Integer> linkedHashMap = budget.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println("sorted by value ascending  " + linkedHashMap);
        final LinkedHashMap<String, Integer> linkedHashMapReverse = budget.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println("sorted by value descending  " + linkedHashMapReverse);
        final LinkedHashMap<String, Integer> linkedHashMapByKey = budget.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println("sorted by key ascending  " + linkedHashMapByKey);
        final LinkedHashMap<String, Integer> linkedHashMapByKeyReverse = budget.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println("sorted by key descending  " + linkedHashMapByKeyReverse);

    }

    public static void mapSort (Map<Employee, Integer> map) {
        final LinkedHashMap<Employee, Integer> collect = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getFirstName)))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println("sorted by key:");
        collect.forEach((k, v) ->
                System.out.println(k + "  " + v)
        );
    }
}
