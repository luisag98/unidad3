
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileInputStream fisLeerArchivo = null;
        FileOutputStream fosEscribirArchivo = null;
        
        
        try {
            fisLeerArchivo = new FileInputStream("c:/archivos/imagen.bmp");
            fosEscribirArchivo = new FileOutputStream("c:/archivos/copia.bmp");
            int iValor = fisLeerArchivo.read();
            while(iValor != -1){
                //ESCRIBIR LO QUE LEEMOS EN EL OTRO ARCHIVO
                fosEscribirArchivo.write(iValor);
                iValor = fisLeerArchivo.read();
            }
            fosEscribirArchivo.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no existe");
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("El archivo no puede leerse");
        } finally {
            //CERRAMOS LOS ARCHIVOS
            try{
                if(fisLeerArchivo != null){
                    fisLeerArchivo.close();
                }
                if(fosEscribirArchivo != null){
                    fosEscribirArchivo.close();
                }
            } catch(IOException e){
                e.printStackTrace();
            }    
        }
        
    }
    
}
