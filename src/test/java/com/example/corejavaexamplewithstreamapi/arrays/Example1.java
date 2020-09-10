package com.example.corejavaexamplewithstreamapi.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class Example1 {

  @Test
  void ListToArray() {
    List<String> movies = Arrays.asList("Captain America", "Avatar", "Harry Potter");
    String[] arrayOfMovies = new String[movies.size()];
    movies.toArray(arrayOfMovies);
    System.out.println("list of String : " + movies);
    System.out.println("array of String : " + Arrays.toString(arrayOfMovies));
  }

  @Test
  void sortArray(){
    Integer[] cubes = new Integer[] { 8, 271, 64, 12, 26 };
    Arrays.sort(cubes);
    System.out.println(Arrays.toString(cubes));
  }

  @Test
  void sortDescArray(){
    Integer[] cubes = new Integer[] { 8, 271, 64, 12, 26 };
    Arrays.sort(cubes,Collections.reverseOrder());
    System.out.println(Arrays.toString(cubes));
  }
  @Test
  void tests(){
   Map<String, Integer> map = new HashMap();
    String a = "Hemant";
    String b = new String(a);
    int val = 0;
    val = (a==b)?1:2;
    if (val == 1)
      System.out.println("Hemant");
      else if (val == 2)
        System.out.println("Hemant sahu");
        else
        System.out.println("ooojib kjhkjh");
      }
    }


