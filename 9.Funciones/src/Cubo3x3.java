
public class Cubo3x3 {

	// Crea una función llamada "dibujarCuadrado3x3", que dibuje un cuadrado formato por 3 filas con 3 asteriscos cada una.
			//Crea también un "main" para comprobar que funciona correctamente.

	
	private static void dibujarcuadrado3x3 (int numero) {
		for(int i=1; i <=numero; i++) {
			
			for(int j=1; j <= numero; j++) {
				System.out.print("*");
				
			}System.out.println("");
		
	}
	
	}
	
	
	
	public static void main(String[] args) {
		
		dibujarcuadrado3x3(3);
		
	}

}
