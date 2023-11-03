package arrays.operations;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindCharacterOfMaxTimesRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,5,6,1,2,5,2,6,2,9,2};
		
		Map<Object, Long> map =Arrays.stream(a).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		int maxTimesRepetedKey = (int) map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey(); //sorting entries based on value
		System.out.println(maxTimesRepetedKey);

	}

}
