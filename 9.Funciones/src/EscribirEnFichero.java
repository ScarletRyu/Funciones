import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirEnFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "Asier es un lento haciendo prg";
        writeUsingFileWriter(data);
        
        
	}
        
        
        private static void writeUsingFileWriter(String data) {
            File file = new File("prueba1.txt");
            FileWriter fr = null;
            try {
                fr = new FileWriter(file);
                fr.write(data);
            } catch (IOException e) {
                e.printStackTrace();
            }finally{
                //close resources
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

}