import java.io.File;
import java.io.*;

public class LeerFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("prueba1.txt");
		
		FileReader fileR = null;
		BufferedReader file2 = null;

		try {
		    fileR = new FileReader(file);
		    file2 = new BufferedReader(fileR);


		} catch (FileNotFoundException e) {
		    System.out.println("No se encontro el archivo "+file.getName());
		}

		try {
		    String lines = "";
		    while( ( lines = file2.readLine()) != null) {
		        System.out.println(lines);
		    }
		} catch (IOException e) {
		    e.printStackTrace();
		}
}
}