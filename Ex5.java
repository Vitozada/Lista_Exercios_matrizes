package listaMatriz;

public class Ex5 {
	public static void main(String[] args) {
		int [][] sofa = new int [5][5];
		
		for (int i = 0; i < sofa.length; i++) {
			for (int j = 0; j < sofa[i].length; j++) {
				if (i == j) {
					sofa[i][j] = 1;
				} else {
					sofa[i][j] =0;
				}
			}
		}
		
		for (int i = 0; i < sofa.length; i++) {
			for (int j = 0; j < sofa[i].length; j++) {
				System.out.printf("|%d|", sofa[i][j]);
			}
			System.out.println();
		}
		
	}
}
