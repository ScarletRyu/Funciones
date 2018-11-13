

public class CalcularCubo {

	
	
	public static float cubone(float numero1) {
		
		
		numero1 =  (float) Math.pow(numero1, 3);
		
		
		System.out.println("el numero indicado al cubo es: " +numero1+ "" );
		return numero1;
		
	}
	
	
	
	
	public static void main(String[] args) {
		// Crea una función que calcule el cubo de un número real (float) que se indique como parámetro.
		//El resultado deberá ser otro número real. Probar esta función para calcular el cubo de 3.2 y el de 5.

		cubone(3);
		cubone((float) 3.2);
		cubone(5);
		
	}

}
