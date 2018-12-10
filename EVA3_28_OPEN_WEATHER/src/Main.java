
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        try {
            // TODO code application logic here
            // CONEXION
            URL url = new URL("https://samples.openweathermap.org/data/2.5/group?id=524901,703448,2643743&units=metric&appid=b6907d289e10d714a6e88b30761fae22");
            HttpURLConnection http = (HttpURLConnection)url.openConnection();
            if(http.getResponseCode() == HttpURLConnection.HTTP_OK){
                // LEER UN TEXTO:
                InputStream is = http.getInputStream();
                InputStreamReader srLector = new InputStreamReader(is);
                BufferedReader bLeer = new BufferedReader(srLector);
                System.out.println(bLeer.readLine());
            }
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
            //LEER EL TEXTO QUE NOS MANDA

    }
    
}
