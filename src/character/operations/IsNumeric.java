package character.operations;

public class IsNumeric {
	
	    public static void main(String[] args) {
	        String input = "12345";

	        boolean isNumeric = input.chars().allMatch(Character::isDigit);

	        if (isNumeric) {
	            System.out.println("The input is numeric.");
	        } else {
	            System.out.println("The input is not numeric.");
	        }
	    }

}
