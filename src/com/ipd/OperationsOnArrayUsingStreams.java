package com.ipd;
import java.util.Arrays;
import java.util.Comparator;

public class OperationsOnArrayUsingStreams {

	public static void main(String args[]) {
        //Filtering elements in a collection based on a certain condition:
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] evenNumbers = Arrays.stream(numbers).filter(n -> n % 2 == 0).toArray();
		Arrays.stream(evenNumbers).forEach(e -> System.out.print(e + " "));
		
		//Mapping elements in an array to another type of element:
		String[] names = {"John", "Jane", "Jim", "Joan"};
		String[] upperCaseNames = Arrays.stream(names).map(String::toUpperCase).toArray(String[]::new);
		Arrays.stream(upperCaseNames).forEach(e -> System.out.print(e + " "));
		
		//Sorting elements in an array:List<Employee> empList = new ArrayList<Employee>();
		Employee[] emp = { new Employee(1, "ravi", 150000L, "male", "computers"),
				new Employee(2, "suresh", 250000L, "male", "chemistry"),
				new Employee(3, "sandhya", 50000L, "female", "chemistry"),
				new Employee(4, "deepu", 450000L, "female", "computers") };
		 
		Employee[] sortedEmp = Arrays.stream(emp).sorted(Comparator.comparing(Employee::getEsalary)).toArray(Employee[]::new);
		Arrays.stream(sortedEmp).forEach(e -> System.out.print(e.getEsalary() + " "));

	}

}
