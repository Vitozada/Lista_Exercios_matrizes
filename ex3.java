package listaMatriz;

import java.util.Random;



public class ex3 {
	public static void main(String[] args) {
		Random rand = new Random();
		int numeros[][] = new int[3][5];
		int qtdPares = 0, qtdImpares = 0;
		boolean repetido = false; 
		int comparar [][] = new int [3][5]; 
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) { // vê a quantidade de numeros impares e pares e adiciona os valores na matriz
				numeros[i][j] = rand.nextInt(1, 300);

				if (numeros[i][j] % 2 == 0) {
					qtdPares += 1;
				} else {
					qtdImpares += 1;
				}
			}
		}

		for (int i = 0; i < numeros.length; i++) { // atribuindo os numeros na matriz de comparar

			for (int j = 0; j < numeros[i].length; j++) {

				System.out.print(numeros[i][j] + " ");		
				comparar[i][j] = numeros[i][j];
			}
		}
		// prints abaixo sao para testes do proprio programa, deixei em prol de mostrar como eu testo os algoritmos passo a passo
		
		int repeticao = 0;
		for (int linha1 = 0; linha1 < 3; linha1++) {
			
			for (int coluna1 = 0; coluna1 < 5; coluna1++) {
				
				for (int i = 0; i < 3; i++) {
					
					for (int j = 0; j < 5; j++) {
							
					//	System.out.print(" " + comparar[linha1][coluna1] + " "); teste pra ver se esta comparando 1 com todos os demais elemtentos
					//	System.out.print(numeros[i][j] + "!!!");
						
						if (linha1 == i && coluna1 == j) {
							System.err.println("mesma linha e mesma coluna");
						}else if (comparar[linha1][coluna1] == numeros[i][j]) {
							System.err.println("repetiu");
							repeticao += 1;
						}else {
							System.out.println("NEGATIVO");
						}
							
						
						
						if (repeticao == 1) {
							repetido = true;
							break;
						}
						
					}
					
					if(repetido) {break;}
				}
			}
		}

		System.err.println("pulou\n");

		// printizinho
		System.out.printf("Numeros pares: %d%nNumeros Impares: %d%nTem numeros repetidos? -> %b", qtdPares, qtdImpares,
				repetido);

	}
}

