
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

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
             FileInputStream LeerArchivo = null;
        FileOutputStream EscribirArchivo = null;
        try {
            LeerArchivo = new FileInputStream("c:/archivos/Documento.txt");
         
            int Valor=LeerArchivo.read();
            while(Valor !=-1){
                System.out.println("" + (char)Valor);
                Valor = LeerArchivo.read();
                
            }
          
        } catch (IOException ex) {
            System.out.println("El archivo no pudo leer");
            ex.printStackTrace();
            
        }finally{
            if(LeerArchivo != null){
                
            }
            if(EscribirArchivo !=null){
                try {
                    EscribirArchivo.close();
                } catch (IOException ex) {
                    
                }
            }
        }
    }
    
}
