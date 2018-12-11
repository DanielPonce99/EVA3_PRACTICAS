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
        Valor Obj1 = new Valor();
        Obj1.iX=100;
        Valor Obj2 = new Valor();
        Obj2.iX=500;
        Intercambiar(Obj1, Obj2);
        System.out.println("Obj 1 =" +Obj1.iX);
        System.out.println("Obj 2 =" +Obj2.iX);
        Valor Temp=Obj1;
        Obj1=Obj2;
        Obj2=Temp;
    }
    public static void Intercambiar (Valor v1, Valor v2){
        Valor Temp=v1;
        v1=v2;
        v2=Temp;
        //Java solo maneja paso por valor todo son copia de valores
    }
}
class Valor{
int iX;    
}
 
