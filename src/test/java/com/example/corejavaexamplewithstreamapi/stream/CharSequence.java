package com.example.corejavaexamplewithstreamapi.stream;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Log4j2
public class CharSequence {
    String val = "lksdlksdkjfDKFSDF asjdlf";

    @DisplayName("Find number of characters present in string ")
    @Test
    void findNumberOfChar ( ) {
        final String replace = val.replace(" ", "");//removing extra space
        final Map<String, Long> stringLongMap = replace.chars().mapToObj(ch -> Character.toString((char) ch))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(stringLongMap);
    }
}
