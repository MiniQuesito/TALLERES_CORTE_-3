package arreglo;



public class Arreglos {
	
	public static void main(String[] args) {

		int [] age = {12, 4, 5, 2, 5};
		
		for (int i = 0; i < 5; i++) {
			
			
			System.out.println("La edad en la posicion: " + i + " es : " +  age[i]);
		}
		
        int y = 0;
        System.out.println("Con ciclo while");
        //while 
        while (y < 5) {
        	
        	System.out.println("La edad en " + "la posicion " + y + " es " + age[y]);
        	
        	y++;
        }
		

		
	}
	
	
	
	

}
