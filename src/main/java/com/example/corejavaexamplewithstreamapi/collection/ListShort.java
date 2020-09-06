package com.example.corejavaexamplewithstreamapi.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListShort {

	public static void main(String[] args) {
		  List<String> names = new ArrayList<String>();
	      names.add("Mahesh ");
	      names.add("Suresh ");
	      names.add("Ramesh ");
	      names.add("Naresh ");
	      names.add("Kalpesh ");	 
	      System.out.println("Without Sort:"+names);
		  System.out.println(names.stream().sorted().collect(Collectors.toList()));
		System.out.println(names.stream().sorted((x,y)->y.compareTo(x)).collect(Collectors.toList()));


		/*
	      //Collections.sort(names);
	      sortingAscendingByJava8(names);
	      System.out.println("Ascending:"+names);
	      sortingDecendingByJava8(names);
	      //Collections.sort(names,(a,b)->b.compareTo(a));
	      System.out.println("Decending:"+names);*/
	     /* System.out.println("=======forEach()==========");
	      names.forEach(f->System.out.println(f));	
	      System.out.println("----------------------");
	      names.forEach(System.out::println);
*/
	}
	
	public static void sortingAscendingByJava8(List<String> names) {
		Collections.sort(names);		
	}
	
	public static void sortingDecendingByJava8(List<String> names) {
		Collections.sort(names,(a,b)->b.compareTo(a));		
	}

	

}
