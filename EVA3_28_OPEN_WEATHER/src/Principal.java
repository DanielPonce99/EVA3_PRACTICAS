
import java.net.HttpURLConnection;
import java.net.URL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel Elias Yañez Ponce 18550346
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Conexion
        URL url = new("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22");
          HttpURLConnection http = (HttpURLConnection)
                  url.openConnection();
          if(http.getResponseCode() == HttpURLConnection.HTTP_OK){
              InputStream is = http.getInputStream();
              InputStreamReader srLector = InputStreamReader(is);
              BufferedReader Leer = 
          }
                }
    
    
}
