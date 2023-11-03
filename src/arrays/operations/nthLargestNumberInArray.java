package arrays.operations;

import java.util.Arrays;
import java.util.Comparator;

public class nthLargestNumberInArray {
	
	public static int findNthLargest(int[] nums, int n) {
		if (n <= 0 || n > nums.length) {
			throw new IllegalArgumentException("Invalid value of n.");
		}

		return Arrays.stream(nums).distinct().boxed().sorted(Comparator.reverseOrder()).skip(n - 1).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("No nth largest number found."));
	}

	public static void main(String[] args) {
		int[] nums = { 4, 2, 7, 3, 1, 9, 6 };
		int n = 3; // Find the 3rd largest number

		int nthLargest = findNthLargest(nums, n);
		System.out.println("The " + n + "th largest number is: " + nthLargest);
	}
	
}
