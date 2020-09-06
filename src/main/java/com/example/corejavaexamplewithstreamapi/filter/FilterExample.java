package com.example.corejavaexamplewithstreamapi.filter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

	public static void main(String[] args) {
		
		List<Emp> listEmpl = Arrays.asList(new Emp(111, "hemant", "IT", 211324l, "bangalore"),
				new Emp(131, "hemant", "IT", 211324, "hyderabad"),
				new Emp(411, "hemant", "IT", 211324, "bangalore"),
				new Emp(151, "hemant", "IT", 211324, "pune"),
				new Emp(171, "hemant", "IT", 211324, "bangalore"),
				new Emp(611, "hemant", "IT", 211324, "pune"),
				new Emp(161, "hemant", "IT", 211324, "bangalore"),
				new Emp(181, "hemant", "IT", 211324, "hyderabad"),
				new Emp(191, "hemant", "IT", 211324, "bangalore"),
				new Emp(411, "hemant", "IT", 211324, "bangalore"),
				new Emp(511, "hemant", "IT", 211324, "hyderabad"),
				new Emp(811, "hemant", "IT", 211324, "bangalore"),
				new Emp(911, "hemant", "IT", 211324, "pune"),
				new Emp(112, "hemant", "IT", 211324, "bangalore"),
				new Emp(113, "hemant", "IT", 211324, "bangalore"),
				new Emp(119, "hemant", "IT", 211324, "hyderabad")
				);
		
		System.out.println("===========================================================");
		listEmpl.forEach(System.out::println);
		System.out.println("==========================bangalore===========================");
		List<Emp> bangalorelistEmpl = listEmpl.stream().filter(emp->emp.getCity().equals("bangalore")).collect(Collectors.toList());
		bangalorelistEmpl.forEach(System.out::println);
		System.out.println("===========================pune===========================");
		List<Emp> punelistEmpl = listEmpl.stream().filter(emp->emp.getCity().equals("pune")).collect(Collectors.toList());
		punelistEmpl.forEach(System.out::println);
		System.out.println("==========================hyderabad===========================");
		List<Emp> hyderabadlistEmpl = listEmpl.stream().filter(emp->emp.getCity().equals("hyderabad")).collect(Collectors.toList());
		hyderabadlistEmpl.forEach(System.out::println);

	}

}
