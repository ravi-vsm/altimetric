package character.operations;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CharMethodExample {
	
public static void main(String args[]) {
	
		/*
		 * The chars() method is a part of the Java CharSequence interface and is often
		 * used in combination with Java streams to work with characters in a string.
		 * When you call chars() on a CharSequence (such as a String), it returns an
		 * IntStream that contains the Unicode code points of the characters in the
		 * sequence.
		 * 
		 * Here's how you can use the chars() method and an IntStream to work with
		 * characters in a string:
		 */	
	
	String text = "Hello, World!";

	IntStream charStream = text.chars();

	// Printing the Unicode code points of characters in the string
	 charStream.forEach(System.out::println);

	// You can also convert the code points back to characters
	String result = charStream.mapToObj(c -> String.valueOf((char)c))
	                         .collect(Collectors.joining());

	System.out.println(result);
	
		/*
		 * In the example above, we first obtain an IntStream containing the Unicode
		 * code points of the characters in the string. We use forEach to print these
		 * code points.
		 * 
		 * You can also convert the code points back to characters by using mapToObj and
		 * String.valueOf((char)c). In the example, we join these characters back
		 * together to form a string.
		 * 
		 * This allows you to perform various operations on the characters in a string
		 * using Java streams, making it easier to manipulate text data
		 */
}

}
