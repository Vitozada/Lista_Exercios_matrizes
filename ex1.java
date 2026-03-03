package listaMatriz;



public class ex1 {

	public static void main(String[] args) {
		
		int numeros [][] = new int [3][3];
		
		int somaPrimaria=0;
		int somaSecundaria =0;
		
		int soma = 0;
		for(int i = 0; i < numeros.length;i++) {
			
			for (int j = 0; j < numeros[i].length; j++) {
				soma+= 1;
				numeros[i][j] = soma;
			}
		}
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				if (i == j) {
					System.out.print(numeros[i][j] + " ");
					somaPrimaria += numeros[i][j];
				}
			}
		}
		
		System.out.println();
		
		// diagonal secundaria
		for (int i = 0; i < numeros.length; i++) {
			int j = numeros.length - 1 - i;
				
				System.out.print(numeros[i][j] + " ");
				somaSecundaria += numeros[i][j];
			}
		System.out.println("");
			
		System.out.printf("Soma da diagonal principal = %d%nSoma da diagonal secundaria = %d", somaPrimaria, somaSecundaria);
		
		}
		

	}
	



