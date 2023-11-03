package arrays.operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateElementsInArray {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 9, 9};

        List<Integer> list = Arrays.asList(array);

        List<Integer> duplicateElements = list.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.println("Duplicate Elements: " + duplicateElements);
    }
}
