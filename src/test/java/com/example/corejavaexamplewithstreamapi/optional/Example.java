package com.example.corejavaexamplewithstreamapi.optional;

import java.util.Optional;
import org.junit.jupiter.api.Test;

public class Example {

  @Test
  void test(){
    //Optional<Long> aLong = Optional.of(null); NPE
    Optional<Long> aLong = Optional.ofNullable(null);

    System.out.println(aLong.orElse(0L).toString());
   }

}
