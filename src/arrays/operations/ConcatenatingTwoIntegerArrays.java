package arrays.operations;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ConcatenatingTwoIntegerArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 4, 5, 6 };

		// Convert the arrays to streams
		IntStream stream1 = Arrays.stream(array1);
		IntStream stream2 = Arrays.stream(array2);

		// Concatenate the streams
		IntStream concatenatedStream = IntStream.concat(stream1, stream2);

		// Convert the concatenated stream back to an array
		int[] concatenatedArray = concatenatedStream.toArray();

		// Print the concatenated array
		System.out.println(Arrays.toString(concatenatedArray));
	}
}
