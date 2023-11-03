package arrays.operations;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSortedArraysUsingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 2, 4, 6 };
		int[] array2 = { 1, 3, 5 };

		// Convert the arrays to streams
		IntStream stream1 = Arrays.stream(array1);;
		IntStream stream2 = Arrays.stream(array2);

		// Concatenate the streams
		int sortedArray[] = IntStream.concat(stream1, stream2).sorted().toArray();
		
		Arrays.stream(sortedArray).forEach(x -> System.out.println(x));
	}

}
