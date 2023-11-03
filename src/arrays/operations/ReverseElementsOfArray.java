package arrays.operations;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseElementsOfArray {

	public static void main(String[] args) {

		// Using IntStream.range:
		int[] originalArray = { 1, 2, 3, 4, 5 };
		int[] reversedArray = IntStream.range(0, originalArray.length)
				.map(i -> originalArray[originalArray.length - 1 - i]).toArray();
		
		Arrays.stream(reversedArray).forEach(x -> System.out.print(x));
		
		/*
		 * The key idea here is to use the IntStream to generate indices in a certain
		 * range and then map those indices to the corresponding elements from the
		 * original array in reverse order, effectively reversing the original array.
		 */
	}

}
