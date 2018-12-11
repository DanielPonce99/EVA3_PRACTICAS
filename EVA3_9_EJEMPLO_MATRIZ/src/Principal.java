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
        int Matriz[][] = new int[5][5];
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                Matriz[i][j] = (int)(Math.random()*100)+1;
                
            }
        }
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                System.out.print("["+ Matriz[i][j]+"]");
                
            }
            System.out.println("");
        }
        System.out.println("ORIGINAL");
        //Copia de la matriz
        int ArregloCopia[][] = new int[5][5];
        for (int i = 0; i < ArregloCopia.length; i++) {
            for (int j = 0; j < ArregloCopia.length; j++) {
                ArregloCopia[i][j] = Matriz[i][j];
                
            }
            
        }
        System.out.println("Copia\n");
        imprimirMatriz.(A)
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
              System.out.print("["+ Matriz[i][j]+"]");  
            }
            System.out.println(""); 
        }
    }
   public static void imprimirMatriz(int matriz[][]){
       for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
              System.out.print("["+ matriz[i][j]+"]");  
            }
            System.out.println(""); 
        }
    public static void LlenarMatriz(int matriz[][]){
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random()*100)+1;
    }
   } 
    
}
}
