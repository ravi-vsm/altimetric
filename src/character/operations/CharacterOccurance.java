package character.operations;

public class CharacterOccurance {

	public static void main(String[] args) {
		
		String input = "programming";
		char targetChar = 'r';

		long charOccurrence = input.chars().mapToObj(c -> (char) c).filter(c -> c == targetChar).count();

		System.out.println("Character '" + targetChar + "' occurs " + charOccurrence + " times in the string.");

	}

}
