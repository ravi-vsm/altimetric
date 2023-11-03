package character.operations;

import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "programming";

        Map<Character, Long> charFrequencyMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()
                ));

        charFrequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue()));
    
	}

}
