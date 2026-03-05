package listaMatriz;

import java.util.Random;

public class Ex8 {
	public static void main(String[] args) {
		Random rand = new Random();

		int[][] matriz = new int[5][5];
		int valor = 7;
		double retorno = -1;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {

				matriz[i][j] = rand.nextInt(0, 15);

			}

		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				
				if (retorno > 0) {
					break;
				}
				
				retorno = (valor == matriz[i][j] ? i + ((double) j / 10)  : -1);
				
				
				
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("|%3d|", matriz[i][j]);
			}
			System.out.println();
		}

		if (retorno == -1) {
			System.err.println("Valor não encontrado");
		} else {
			System.out.println(retorno);

		}
	}
}
