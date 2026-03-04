package listaMatriz;

public class Ex6 {
	public static void main(String[] args) {

		double[][] numeros = new double[4][4];

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {

				double posicao = i + ((double) j / 10); // casting para double ;

				numeros[i][j] = posicao;
			}
		}

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.printf("|%.1f|", numeros[i][j]);
			}
			System.out.println();
		}
	}
}