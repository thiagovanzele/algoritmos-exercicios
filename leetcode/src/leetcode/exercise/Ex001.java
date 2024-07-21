package leetcode.exercise;

import java.util.HashMap;
import java.util.Map;

public class Ex001 {

	public static void main(String[] args) {

		/*
		 * 1. Duas somas
		 * Dado um array de inteiros nums e um
		 * inteiro target, retorne os índices dos dois números de modo que a soma deles
		 * sejatarget .
		 * 
		 * Você pode assumir que cada entrada teria exatamente uma solução e não pode
		 * usar o mesmo elemento duas vezes.
		 * 
		 * Você pode retornar a resposta em qualquer ordem.
		 * 	 * 
		 * 
		 * Exemplo 1:
		 * 
		 * Entrada: nums = [2,7,11,15], alvo = 9 Saída: [0,1] Explicação: Como nums[0] +
		 * nums[1] == 9, retornamos [0, 1]. Exemplo 2:
		 * 
		 * Entrada: nums = [3,2,4], alvo = 6 Saída: [1,2] Exemplo 3:
		 * 
		 * Entrada: nums = [3,3], alvo = 6 Saída: [0,1]
		 */
		int numeros [] = twoSum(new int[] {11, 15, 7, 2}, 9);
		for (int n : numeros) {
			System.out.print(n + " ");
		}
		
	}
	
	public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complements = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
        	Integer complementIndex = complements.get(nums[i]);
        	if (complementIndex != null) {
        		return new int[] {i, complementIndex};
        	}
        	complements.put(target - nums[i], i);
        }
        return nums;
    }

}
