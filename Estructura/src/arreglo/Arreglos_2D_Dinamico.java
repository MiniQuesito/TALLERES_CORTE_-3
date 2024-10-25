package arreglo;

public class Arreglos_2D_Dinamico {

	public static void main(String[] args) {
		
		//se define el tamaño de la matriz
		
		int row = 6;
		int column = 7;
		
		
		int [] [] arreglo = new int [row] [column];
		
		
		//Se llenara la matriz con datos ramdom
		for(int i = 0; i < row; i++) {
			
			for(int j = 0; j < column; j++) {
				
				System.out.println("La fila: " + i );
				System.out.println("La columna: " + j);
				arreglo [i] [j] = (int) (Math.random()*10);
				System.out.println("La matriz " + arreglo [i] [j] + " En cada posición");
			}
		}
		
		for (int i = 0; i < row; i++) {
			
			for(int j = 0; j < column; j++) {
				
				System.out.print(arreglo [i] [j] + "  ");
			}
			System.out.println("\n");
		}

	}
	
	

}
