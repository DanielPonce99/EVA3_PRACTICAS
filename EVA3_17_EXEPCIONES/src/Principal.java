
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
         int Resu=0; 
        try{ //Instruciones que se pueden generar exepcion
        System.out.println("Divisor");
        int Divi = input.nextInt();
        System.out.println("Dividendo");
        int Dividendo = input.nextInt();
       
       
            System.out.println("Error de la captura");
            int iVal= input.nextInt();
            Resu = Dividendo/Divi;
        }catch(ArithmeticException e){ //Excepciones que se pueden generar
                System.out.println("El divisor es Cero y no se puede realizar la divison");
        } //
        catch(InputMismatchException e){ //Excepciones que se pueden generar
               System.out.println("El valor cpturado no es valido");
        } //instruciones en caso de error
        System.out.println("Resultado: " + Resu);
    }
    
}
