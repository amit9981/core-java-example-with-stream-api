package com.example.corejavaexamplewithstreamapi.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamOperation {

  public static Set<Integer> removeDuplicate(List<Integer> integers){
    return integers.stream().collect(Collectors.toSet());
  }

}
