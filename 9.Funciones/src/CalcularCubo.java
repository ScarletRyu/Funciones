

public class CalcularCubo {

	
	
	public static float cubone(float numero1) {
		
		
		numero1 =  (float) Math.pow(numero1, 3);
		
		
		System.out.println("el numero indicado al cubo es: " +numero1+ "" );
		return numero1;
		
	}
	
	
	
	
	public static void main(String[] args) {
		// Crea una funci�n que calcule el cubo de un n�mero real (float) que se indique como par�metro.
		//El resultado deber� ser otro n�mero real. Probar esta funci�n para calcular el cubo de 3.2 y el de 5.

		cubone(3);
		cubone((float) 3.2);
		cubone(5);
		
	}

}
