package listaMatriz;

import java.util.Random;

public class ex4 {
	public static void main(String[] args) {
		Random rand = new Random();

		int[][] numeros = new int[4][4];
		int qtdMaioresDez = 0;

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = rand.nextInt(1, 20);
				if (numeros[i][j] > 10) { // se maior que 10 conta mais 1
					qtdMaioresDez++;
				}
				System.out.print(numeros[i][j] + " ");
			}
		}
		System.out.printf("%nNesta matriz possui %d numeros maiores que 10!", qtdMaioresDez);
	}
}
