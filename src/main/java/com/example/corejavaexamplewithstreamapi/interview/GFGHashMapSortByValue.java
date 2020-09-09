package com.example.corejavaexamplewithstreamapi.interview;

// Java program to sort hashmap by values
import java.util.*;
import java.lang.*;

public class GFGHashMapSortByValue {

  // function to sort hashmap by values
  public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
  {
    // Create a list from elements of HashMap list of entry
    List<Map.Entry<String, Integer> > list =
        new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());

    // Sort the list
    Collections.sort(list, (m1,m2)->{
      return m1.getValue().compareTo(m2.getValue());
    });

    // put data from sorted list to hashmap
    HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();

    list.forEach(x->{
      temp.put(x.getKey(),x.getValue());
    });
    return temp;
  }

  // Driver Code
  public static void main(String[] args)
  {

    HashMap<String, Integer> hm = new HashMap<String, Integer>();
    // enter data into hashmap
    hm.put("Math", 98);
    hm.put("Data Structure", 85);
    hm.put("Database", 91);
    hm.put("Java", 95);
    hm.put("Operating System", 79);
    hm.put("Networking", 80);
    Map<String, Integer> hm1 = sortByValue(hm);

    // print the sorted hashmap
    hm1.forEach((x,y)->{
      System.out.println(x +" = "+y);
    });
  }
}
