package arrays.operations;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringsArrayByLength {
	
	public static void main(String[] args) {
		String[] strings = { "date", "elderberry","apple", "banana", "cherry" };

		Arrays.stream(strings).sorted(Comparator.comparing(String::length)).forEach(System.out::println);
	}
}
