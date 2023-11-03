package arrays.operations;

import java.util.Arrays;

public class SumOfAllElementsInArray {

	public static void main(String[] args) {

		int a[] = { 2, 3, 6, 9 };
		
		int sum = Arrays.stream(a).sum();
		System.out.println("SUM::" + sum);

		double avg = Arrays.stream(a).average().getAsDouble();
		System.out.println("AVG::" + avg);
	}

}
