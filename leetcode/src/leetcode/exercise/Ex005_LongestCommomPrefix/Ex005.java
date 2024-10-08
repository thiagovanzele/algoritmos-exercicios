package leetcode.exercise.Ex005_LongestCommomPrefix;

import java.util.Arrays;

public class Ex005 {

	public static void main(String[] args) {
		String[] palavras = new String[] {"flor","fluxo","voo"};
		String prefixo = longestCommonPrefix(palavras);
		System.out.println(prefixo);
	}

	public static String longestCommonPrefix(String[] strs) {
		StringBuilder resposta = new StringBuilder();
		Arrays.sort(strs);
		String primeira = strs[0];
		String ultima = strs[strs.length - 1];
		int tam = Integer.min(primeira.length(), ultima.length());
		
		for (int i = 0; i < tam; i++) {
			if (primeira.charAt(i) != ultima.charAt(i)) {
				return resposta.toString();
			} else {
				resposta.append(primeira.charAt(i));
			}
		}
		
		return resposta.toString();
	}
}
