
import java.util.InputMismatchException;
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
        //Usando exepciones y ciclos, preguntar hasta que se 
        //Capturen valores validos y el divisor no sea cero
        //Mostrar el resultado de la division
        do{
            try{
        System.out.println("Divisor");
        int Divi = input.nextInt();
        System.out.println("Dividendo");
        int Dividendo = input.nextInt();
            } catch(InputMismatchException e){ //Excepciones que se pueden generar
               input.next();
        } //instruciones en caso de error
    }while
    }
    
}
