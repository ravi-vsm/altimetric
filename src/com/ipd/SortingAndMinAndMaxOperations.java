package com.ipd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortingAndMinAndMaxOperations {

	public static void main(String args[]) {

		List<Integer> list = Arrays.asList(1, 34, 23, 15, 9);
		
		//max element in the given list
		Integer maxNumber = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Max Element::" + maxNumber);
		
		//min element in the given list
		Integer minNumber = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Min Element::" + minNumber);
		
		//Ascending Order
        System.out.println("Ascending Order::");
		list.stream().sorted().forEach(System.out::println);
		
		//Dscending Order
		System.out.println("Dscending Order::");
		list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out :: print);
		
		//second highest number in a list of integers
		Optional<Integer> secondHighest = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		if (secondHighest.isPresent()) {
		    System.out.println("\nSecond highest number is: " + secondHighest.get());
		} else {
		    System.out.println("\nList doesn't have a second highest number");
		}
		
		
		
		/*------------------------------------------------------------------------------------------------------------*/
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "ravi", 150000L, "male", "computers"));
		empList.add(new Employee(2, "suresh", 250000L, "male", "chemistry"));
		empList.add(new Employee(3, "sandhya", 50000L, "female", "chemistry"));
		empList.add(new Employee(4, "deepu", 450000L, "female", "computers"));
		
		System.out.println("\nfinding max salary of employee");
		Optional<Employee> empMax = empList.stream().max(Comparator.comparing(Employee::getEsalary));
		System.out.println(empMax.get().getEsalary());
		
		System.out.println("\nfinding min salary of employee");
		Optional<Employee> empMin = empList.stream().min(Comparator.comparing(Employee::getEsalary));
		System.out.println(empMin.get().getEsalary());
		
		System.out.println("\nsort the employees based on salary in Ascending Order");
		List<Employee>  sortEmp = empList.stream().sorted(Comparator.comparing(Employee::getEsalary)).collect(Collectors.toList());
		sortEmp.forEach(emp -> System.out.println(emp.getEsalary()));
		
		System.out.println("\nsort the employees based on salary in Dscending Order");
		List<Employee>  sortEmp1 = empList.stream().sorted(Comparator.comparing(Employee::getEsalary).reversed()).collect(Collectors.toList());
		sortEmp1.forEach(emp -> System.out.println(emp.getEsalary()));
		
		System.out.println("\nMax Salary of Emp - 1st Approach");
		Long maxSalary = empList.stream().map(Employee::getEsalary).max(Long::compare).get();  //here it will give max salary integer not Max sal emp obj
		System.out.println(maxSalary);
		
		System.out.println("\nMax Salary of Emp - 2nd Appraoch");
		Employee  second = empList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee :: getEsalary))).get(); //here it will give max emp ohj
		System.out.println(second.getEsalary());
		
		System.out.println("\nMin Salary of Emp - 1st Approach"); 
		Long minSalary = empList.stream().map(Employee::getEsalary).min(Long::compare).get(); //here it will give min salary integer not min sal emp obj
		System.out.println(minSalary);
		
		System.out.println("\nMin Salary of Emp - 2nd Approach");
		Employee  min = empList.stream().collect(Collectors.minBy(Comparator.comparing(Employee :: getEsalary))).get(); //here it will give max emp ohj
		System.out.println(min.getEsalary());
		
		System.out.println("\nSecond Max Salary of Emp");
		Employee  secondSal = empList.stream().sorted(Comparator.comparing(Employee::getEsalary).reversed()).skip(1).findFirst().get();
		System.out.println(secondSal.getEsalary());
		
		System.out.println("\nEmployee Count in Each Department");
		Map<String, Long> count =empList.stream().collect(Collectors.groupingBy(Employee :: getDept, Collectors.counting()));
		System.out.println(count);
		
		System.out.println("\nEmployee Max Salary of Each Department");
		Map<String, Optional<Employee>> cou =empList.stream().collect(Collectors.groupingBy(Employee :: getDept, Collectors.maxBy(Comparator.comparing(Employee::getEsalary))));
		cou.entrySet().forEach(entry -> System.out.println("Dept::"+ entry.getKey() + " , max emp salary::" + entry.getValue().get().getEsalary()));
		
		/*------------------------------------------------------------------------------------------------------------*/
		
		//Write a program to find the sum of even numbers in a list of integers.
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumOfEvenNumbers = numbers.stream()
        .filter(n -> n % 2 == 0)
        .mapToInt(Integer::intValue)
        .sum();   //In this program, we first filter the stream to keep only even numbers using the filter() method. We then use mapToInt() to convert the stream of Integer objects to an IntStream, which has a sum() method that returns the sum of all the elements in the stream

        System.out.println("Sum of even numbers is: " + sumOfEvenNumbers);
        
        /*------------------------------------------------------------------------------------------------------------*/
        
        //average of a list of integers.
        List<Integer> numers = Arrays.asList(1, 2, 3, 4, 5);

        OptionalDouble average = numers.stream().mapToInt(Integer::intValue).average();

        if (average.isPresent()) {
            System.out.println("Average of numbers is: " + average.getAsDouble());
        } else {
            System.out.println("List is empty");
        }
        
        /*------------------------------------------------------------------------------------------------------------*/
        
        //first non-repeated character in a string
        String str = "abbcdef";

        Optional<Character> firstNonRepeatedChar = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
                .findFirst(); //In this program, we first convert the string to a stream of int values using the chars() method. We then use mapToObj() to convert the stream of int values to a stream of Character objects. We filter the stream to keep only characters that have the same first and last index using filter(), and then call findFirst() to get the first non-repeated character. Note that this program assumes that the string contains only ASCII characters.

        if (firstNonRepeatedChar.isPresent()) {
            System.out.println("First non-repeated character is: " + firstNonRepeatedChar.get());
        } else {
            System.out.println("String doesn't have a non-repeated character");
        }
        
        /*------------------------------------------------------------------------------------------------------------*/
        
        //find number of occurrences of each word -1st approach
        String input = "Ravi is Ravi he never change because never Ravi";
        Map<String, Long> ma = Arrays.stream(input.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(ma);
        
        //find number of occurrences of each word -2nd approach
        Map<String, Long> maa = Arrays.stream(input.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(maa);
       
        //finding duplicate elements
		int[] arr = { 1, 2, 3, 4, 1, 2, 5, 6, 5, 7 };
		Map<Integer, Long> frequencyMap = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		frequencyMap.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).forEach(System.out::println);
		
		//convert list to map, take key=id & value = obj
		Map<Integer, Employee> empMap = empList.stream().collect(Collectors.toMap(Employee::getEid, emp -> emp));
		System.out.println(empMap);
		
        
       
	}

}
