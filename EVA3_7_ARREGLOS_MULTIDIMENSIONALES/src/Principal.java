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
        int Matriz[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Matriz[i][j] = (int)(Math.random() *100);
            }
        }
        System.out.println(Matriz);
        System.out.println(Matriz[0]);
        System.out.println(Matriz[0][0]);
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j<Matriz.length; j++) {
                System.out.println(Matriz[i][j]);
        }
        }
        System.out.println("Usando el FOR EACH");
        for (int[] is : Matriz) {
            for (int i : is) {
                System.out.println(i);
            }
        }
 
    }
    
}
