package leetcode.exercise.Ex007_Fibonacci;

public class Ex007 {

	public static void main(String[] args) {

		mostraFibonacci(3);
	}

	private static void mostraFibonacci(int n) {
		int a = 0, b = 1;
		
		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			
			int proximo = a + b;
			a = b;
			b = proximo;
			
			
		}
		
	}
	

}
