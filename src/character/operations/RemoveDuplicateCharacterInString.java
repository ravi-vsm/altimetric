package character.operations;

import java.util.stream.Collectors;

public class RemoveDuplicateCharacterInString {

	public static void main(String[] args) {
        String input = "programming";

        String deduplicated = input.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.joining()); //this "joining can be appllied the String form of characters, thats why here used map

        System.out.println("String with duplicates removed: " + deduplicated);
    }
}
