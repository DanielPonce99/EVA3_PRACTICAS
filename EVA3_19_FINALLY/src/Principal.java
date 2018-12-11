
import java.util.Scanner;

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
        Scanner input = new Scanner(System.in);
         System.out.println("Divisor");
        int Divi = input.nextInt();
        System.out.println("Dividendo");
        int Dividendo = input.nextInt();
        int Resu = 0;
        try{
        Resu=Dividendo/Divi;
        }catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println("Division entre cero");
        }finally{//Siempre se ejecuta
            //Cerrar archivos, libera recursos
            //Se pueden generar excepciones
            System.out.println("Bloque Finally");
        }
        System.out.println("Resultado: " + Resu);
    }
    
}
