import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordInSentence {

	public static void main(String[] args) {

		String sentence = "This is a sample sentence to demonstrate word reversal.";
		String wordToReverse = "sample";

		String reversedSentence = reverseWordInSentence(sentence, wordToReverse);

		System.out.println("Original Sentence: " + sentence);
		System.out.println("Reversed Sentence: " + reversedSentence);
	}

	public static String reverseWordInSentence(String sentence, String wordToReverse) {
		//reverse given word in a String
		return Arrays.stream(sentence.split(" ")).map(word -> word.equals(wordToReverse) ? reverseWord(word) : word)
				.collect(Collectors.joining(" "));
		
        //reverse every word in a String
		//return Arrays.stream(sentence.split(" ")).map(word -> reverseWord(word)).collect(Collectors.joining(" "));
	}

	public static String reverseWord(String word) {
		return new StringBuilder(word).reverse().toString();
	}

}
