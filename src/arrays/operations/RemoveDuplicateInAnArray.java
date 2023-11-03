package arrays.operations;

import java.util.Arrays;

public class RemoveDuplicateInAnArray {
	
	public static void main(String[] args) {
        String[] array = {"apple", "banana", "apple", "cherry", "banana"};

        // Using Java streams to remove duplicates
        String[] distinctArray = Arrays.stream(array)
                .distinct()
                .toArray(String[]::new);

        // Printing the distinct elements
        Arrays.stream(distinctArray).forEach(System.out::println);
    }
}
