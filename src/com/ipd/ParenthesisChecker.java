package com.ipd;
import java.util.Stack;

public class ParenthesisChecker {

    public static boolean checkParentheses(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.empty()) {
                    return false;
                }

                char top = stack.pop();

                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.empty();
    }

	/*
	 * We first create a Stack to store the opening parentheses as we encounter them
	 * in the string.We then loop through each character in the string. If the
	 * character is an opening parenthesis ((, [, or {), we push it onto the stack.
	 * If it's a closing parenthesis (), ], or }), we check if the stack is empty.
	 * If it is, we know that the string is not balanced, since there is no
	 * corresponding opening parenthesis. Otherwise, we pop the top character from
	 * the stack and check if it matches the current closing parenthesis. If it
	 * doesn't, we know that the string is not balanced.After processing all the
	 * characters in the string, we check if the stack is empty. If it is, we know
	 * that all the opening parentheses have been matched with closing parentheses,
	 * and the string is balanced. Otherwise, we know that there are unmatched
	 * opening parentheses, and the string is not balanced.
	 */
    public static void main(String[] args) {
        String str = "((()))";

        if (checkParentheses(str)) {
            System.out.println("The string is balanced.");
        } else {
            System.out.println("The string is not balanced.");
        }
    }
}