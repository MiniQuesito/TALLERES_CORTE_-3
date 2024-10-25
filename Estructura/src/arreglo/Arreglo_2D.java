package arreglo;
import java.util.Scanner;

public class Arreglo_2D {
	
	public static void main(String[] args) {
		
		//Declaramos el Scanner
		 Scanner sc = new Scanner(System.in);
		
		//Se define las filas y las columnas 
		
		 System.out.println("Ingrese la cantidad de filas de la matriz: ");
		int rows = sc.nextInt();
		System.out.println("Ingrese la cantidad de columnas de la matriz: ");
		int column = sc.nextInt();
		
		//Se crea el arreglo 
		int [] [] toto = new int [rows] [column];
		
		//Para llenar la matriz 
		
		int valorM = 1;
		
		//primero se recorre las filas y luego las columnas
		
		for(int i = 0; i < rows; i++) {
			
			for(int j = 0; j < column; j++) {
				

				System.out.println("La fila: " + i );
				System.out.println("La columna: " + j);
				System.out.print("Ingrese un numero:  ");
				toto [i] [j] = sc.nextInt();
				System.out.println("La matriz " + toto [i] [j] + " En cada posición");
			}
		}
		
		for (int i = 0; i < rows; i++) {
			
			for(int j = 0; j < column; j++) {
				
				System.out.print(toto [i] [j] + "  ");
			}
			System.out.println("\n");
		}
		
		System.out.println("ESO ES TODO ------ GUARDELO AHIIIIIIIÍIIIIÍ"); 
		
		
		
	}
	

}
