
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
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
         System.out.println("Divisor");
        int Divi = input.nextInt();
        System.out.println("Dividendo");
        int Dividendo = input.nextInt();
        if (Divi==0){
                
//Lanzamos nuestra propia excepcion
            throw new Exception("Hola Mundo Cruel!!");
        
        }
    }
    }
    

