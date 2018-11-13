
public class Funcionprimo {


		public static class EsPrimo {

			
			
			
			public  static void Primo (int limite) {
				for (int i=1; i<=limite; i++) {
					if(esPrimo(i)) {
						System.out.println("Numero primo: " +i);
					}
				}
			}
			
			
			
			public static boolean esPrimo(int numero) {
				int aux;
				for(int cont=2;cont<numero;cont++) {
					aux=numero%cont;
					if(aux==0)
						return false;
					
				}

				
				
			return true;
			
				
			}
			public static void main(String[] args) {
				Primo(17);
		}
	}

}
