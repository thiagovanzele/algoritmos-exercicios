package leetcode.exercise.Ex004_RomanToInt;

import java.util.HashMap;
import java.util.Map;

public class Ex004 {

	public static void main(String[] args) {

		String n = "IXV";
		System.out.println(romanToInt(n));

	}

	public static int romanToInt(String s) {
		Map<Character, Integer> romanos = new HashMap<>();
		
		romanos.put('I', 1);
		romanos.put('V', 5);
		romanos.put('X', 10);
		romanos.put('L', 50);
		romanos.put('C', 100);
		romanos.put('D', 500);
		romanos.put('M', 1000);
		
		int resultado = 0;
		
		for (int i = 0; i < s.length(); i ++) {
			if (i < s.length() -1 && romanos.get(s.charAt(i)) < romanos.get(s.charAt(i + 1))) {
				resultado -= romanos.get(s.charAt(i));
			} else {
				resultado += romanos.get(s.charAt(i));
			}
		}
		
		return resultado;
	}

}
