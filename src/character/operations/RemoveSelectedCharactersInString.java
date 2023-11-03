package character.operations;

import java.util.stream.Collectors;

public class RemoveSelectedCharactersInString {

	public static void main(String[] args) {
        String input = "programming";
        String charactersToRemove = "aeiou"; // Characters to be removed

        String result = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !charactersToRemove.contains(String.valueOf(c)))
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println("String with selected characters removed: " + result);
    } 
}
