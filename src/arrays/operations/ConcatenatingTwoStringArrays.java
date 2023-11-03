package arrays.operations;
import java.util.Arrays;
import java.util.stream.Stream;

public class ConcatenatingTwoStringArrays {

	public static void main(String args[]) {

		String strArray1[] = { "ravi", "sandhaya", "deepthi", "richs" };
		String strArray2[] = { "sravanthi", "swathi", "rahini", "swapna" };

		// Method to concatenate two arrays in Java 8 and above
		String strArray3[] = Stream.of(strArray1, strArray2)
				.flatMap(Stream::of)           // or, use `Arrays::stream`
				.toArray(String[]::new);
		
		System.out.println(Arrays.toString(strArray3));
		
		// Method to concatenate two arrays in Java 8 and above
		String strArray4[] = Stream.concat(Arrays.stream(strArray1), Arrays.stream(strArray2))
		                    .toArray(String[]::new);
		System.out.println(Arrays.toString(strArray4));
	
	}

}
