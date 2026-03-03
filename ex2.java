package listaMatriz;

import java.util.Scanner;

public class ex2 {

	static Scanner ler = new Scanner(System.in); // GLOBAL

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double notas[][] = new double[10][4];
		double medias[] = new double[10];

		preencherBimestres(notas);

		calcularMedias(notas, medias);

		for (int i = 0; i < medias.length; i++) {
			System.out.printf("Média do aluno %d - %.2f%n", (i + 1), medias[i]);
		}

	}

	/**
	 *
	 * @param notas Preenche as notas do bimestre de cada aluno
	 * 
	 */
	public static void preencherBimestres(double[][] notas) {

		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.printf("Insira a nota do %dº bimestre do aluno %d%n", (j + 1), (i + 1));
				notas[i][j] = ler.nextDouble();

			}
		}
	}

	public static double[] calcularMedias(double[][] notas, double[] medias) {

		for (int i = 0; i < notas.length; i++) {
			double soma = 0;
			for (int j = 0; j < 4; j++) {

				soma += notas[i][j];

				medias[i] = soma / 4;

			}
		}

		return medias;
	}

}
