package leetcode.exercise.Ex003_PalindromeNumber;

public class Ex003 {

	public static void main(String[] args) {

		System.out.println(isPalindrome(-121));
	}

	public static boolean isPalindrome(int x) {

		String numX = new StringBuilder(Integer.toString(x)).reverse().toString();
			
		return Integer.toString(x).equals(numX);
	}
}
