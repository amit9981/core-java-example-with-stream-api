package com.example.corejavaexamplewithstreamapi.java8features.project;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class EmployeePredicates {

	public static Predicate<Employee> isAdult() {

		return p -> p.getAge() >= 18;
	}

	public static Predicate<Employee> isMAdult() {

		return p -> p.getAge() >= 18 && p.getGender().equalsIgnoreCase("M");
	}

	public static Predicate<Employee> isFAdult() {

		return p -> p.getAge() >= 18 && p.getGender().equalsIgnoreCase("F");
	}
	
	public static Predicate<Employee> isAgeGreater(Integer age) {

		return p -> p.getAge() > age;
	}
	
	//Operational methods
	
	public static List<Employee> getList(List<Employee> employees,Predicate<Employee> emPredicate) {
		
		return employees.stream().filter(emPredicate).collect(Collectors.toList());

		
	}

}
