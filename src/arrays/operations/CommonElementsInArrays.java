package arrays.operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] array1 = {1, 6, 3, 4, 5};
        Integer[] array2 = {3, 4, 5, 6, 7};
        Integer[] array3 = {5, 6, 7, 8, 9};

        List<Integer> list1 = Arrays.asList(array1);
        List<Integer> list2 = Arrays.asList(array2);
        List<Integer> list3 = Arrays.asList(array3);

        List<Integer> commonElements = list1.stream()
                .filter(list2::contains)
                .filter(list3::contains)
                .collect(Collectors.toList());

        System.out.println("Common Elements: " + commonElements);

	}

}
