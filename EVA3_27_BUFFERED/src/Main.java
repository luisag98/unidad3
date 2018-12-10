
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
Archivos de texto:
Abrir el archivo   ---> InputStream
Leer bytes         ---> InputStreamReader
Convertir a texto  ---> BufferedReader
*******************************************
InputStream
InputStreamWriter
Buffered Writer
 */

/**
 *
 * @author temporal2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InputStream isAbrir = null;
        InputStreamReader isLeer = null;
        BufferedReader brTexto = null;
        
        try {
            isAbrir = Files.newInputStream(Paths.get("c:/archivos/texto.txt"));
            isLeer = new InputStreamReader(isAbrir);
            brTexto = new BufferedReader(isLeer);
            String sLinea = brTexto.readLine();
            while(sLinea != null){
                System.out.println(sLinea);
                sLinea = brTexto.readLine();
            }
            brTexto.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
