package arrays.operations;
import java.util.Arrays;

public class MinAndMaxElementInArrray {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int max = Arrays.stream(numbers).max().getAsInt();
		int min = Arrays.stream(numbers).min().getAsInt();

		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
	}

}
