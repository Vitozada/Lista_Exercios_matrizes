package listaMatriz;

import java.util.Random;

public class Ex7 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[][] algarismos = new int[4][4];
		int maior = 0;
		double localizacao = 0;
		for (int i = 0; i < algarismos.length; i++) {
			for (int j = 0; j < algarismos[i].length; j++) {
				algarismos[i][j] = rand.nextInt(10, 200);

				if (algarismos[i][j] > maior) {
					maior = algarismos[i][j];
					localizacao = i + ((double) j / 10);
				}
			}
		}

		for (int i = 0; i < algarismos.length; i++) {
			for (int j = 0; j < algarismos[i].length; j++) {
				System.out.printf("|%3d|", algarismos[i][j]);
			}
			System.out.println();
		}

		System.out.println("maior valor na posição " + localizacao);

	}
}
