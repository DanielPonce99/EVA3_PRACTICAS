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
        int Val=0;
        Llenar(Val);
        System.out.println(Val);
    }
    public static void Llenar(int i){
        i= (int)(Math.random()*100)+1;
    }
}
