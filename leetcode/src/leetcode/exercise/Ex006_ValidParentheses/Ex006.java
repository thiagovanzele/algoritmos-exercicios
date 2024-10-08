package leetcode.exercise.Ex006_ValidParentheses;

import java.util.ArrayList;
import java.util.List;

public class Ex006 {

	public static void main(String[] args) {

		System.out.println(isValid("()"));
	}

	public static boolean isValid(String s) {
		List<Character> parenteses = new ArrayList<>();
		
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				parenteses.add(s.charAt(i));
				
			} else if (s.charAt(i) == ')') {
				if (!parenteses.contains('(')) {
					return false;
				} else {
					parenteses.remove(Character.valueOf('('));
				}
				
			} else if (s.charAt(i) == '}' ) {
				if (!parenteses.contains('{')) {
					return false;
				} else {
					parenteses.remove(Character.valueOf('{'));
				}
				
			} else if (s.charAt(i) == ']') {
				if (!parenteses.contains('[')) {
					return false;
				} else {
					parenteses.remove(Character.valueOf('['));
				}
			}
		}
		
		return parenteses.isEmpty();
	}

}
