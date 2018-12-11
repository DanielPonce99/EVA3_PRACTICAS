
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] Meses =new String[12];
        Meses[0] = "Enero";
        Meses[1] = "Febrero";
        Meses[2] = "Marzo";
        Meses[3] = "Abril";
        Meses[4] = "Mayo";
        Meses[5] = "Junio";
        Meses[6] = "Julio";
        Meses[7] = "Agosto";
        Meses[8] = "Septiembre";
        Meses[9] = "Octubre";
        Meses[10] = "Noviembre";
        Meses[11] = "Diciembre";
        
        Scanner input = new Scanner (System.in);
        System.out.println("Introduce el numero de meses(1-12)");
        //Restamos uno porque el arreglo comienza en cero
        //Los arreglos inmutables
        // No se puede cambiar su tamaño
        int Mes = input.nextInt()-1;
        System.out.println("El mes es " + Meses(Mes));
    }
    
}
