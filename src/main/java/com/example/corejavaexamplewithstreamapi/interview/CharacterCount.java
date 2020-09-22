package com.example.corejavaexamplewithstreamapi.interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {

    public static String charCount (String value) {
        StringBuilder stringBuilder = new StringBuilder();
        final Map<String, Long> collect = value.chars().mapToObj(ch -> Character.toString((char) ch))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.forEach((k,v)->{
            stringBuilder.append(k+v);
        });
       return stringBuilder.toString();
    }
}
