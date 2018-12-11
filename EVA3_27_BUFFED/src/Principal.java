
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        InputStream Abrir = null;
        InputStreamReader Leer = null;
        BufferedReader  Texto = null;
        
        try {
            Abrir = Files.newInputStream(Paths.get("c:/Archivos/Documento.txt"));
            Leer = new InputStreamReader(Abrir);
            Texto = new BufferedReader(Leer);
            String Linea =Texto.readLine();
            while (Linea != null){
                System.out.println(Linea);
                Linea = Texto.readLine();
            }
            Texto.close();
        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }
    
}
