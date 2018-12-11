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
        int Arreglo[]=new int[5];
        Llenar(Arreglo);
        for (int i = 0; i < Arreglo.length; i++) {
            System.out.println("[" +Arreglo[i]+"]");
        }
    }
    public static void Llenar(int Arre[]){
        for (int i = 0; i < Arre.length; i++) {
            Arre[i]= (int)(Math.random()*100)+1;
        }
    }
}
