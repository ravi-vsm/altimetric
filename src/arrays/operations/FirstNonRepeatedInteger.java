package arrays.operations;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedInteger {

	public static void main(String args[]) {
		Integer inputArray[] = { 1, 2, 3, 6, 7, 4, 6, 4 };
		Map<Integer, Long> collect = Arrays.stream(inputArray)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		collect.forEach((x, y) -> System.out.println("Key: " + x + " Val: " + y));

		Optional<Integer> firstNonRepeat = collect.entrySet().stream().filter((e) -> e.getValue() == 1)
				.map(e -> e.getKey()).findFirst();

		if (firstNonRepeat.isPresent()) {
			System.out.println("First non repeating:" + firstNonRepeat.get());
		}
		Optional<Integer> firstRepeat = collect.entrySet().stream().filter((e) -> e.getValue() > 1).map(e -> e.getKey())
				.findFirst();
		System.out.println("First repeating:" + firstRepeat.orElse(null));
	}

}
