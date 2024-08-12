package aleatorio.exercise.Ex001_Sublistas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex001 {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 5, 6,
				8, 9);
		int tamanhoSubLista = 3;
		List<List<Integer>> sublists = criaSubListas(
				numeros, tamanhoSubLista);

		for (List<Integer> lista : sublists) {
			if (lista.size() == tamanhoSubLista) {
				System.out.println(lista);
			}
		}

	}

	public static List<List<Integer>> criaSubListas(
			List<Integer> lista, int subListSize) {
		List<List<Integer>> sublists = new ArrayList<>();

		for (int i = 0; i < lista.size(); i++) {
			sublists.add(new ArrayList<Integer>(
					lista.subList(i, Math.min(lista.size(),
							i + subListSize))));
		}

		return sublists;
	}
}
