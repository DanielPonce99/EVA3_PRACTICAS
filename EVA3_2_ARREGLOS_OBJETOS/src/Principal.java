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
        Persona[] apAlumnos = new Persona[5];
        for (int i = 0; i < apAlumnos.length; i++) {
            apAlumnos[i]= new Persona("Juan Perez");
            
        }
        for (int i = 0; i < apAlumnos.length; i++) {
            apAlumnos[i].Imprimir();
        }
    }
    
}
class Persona{
    public String Nombre;
    public void Imprimir(){
        System.out.println(Nombre);
    }
    public Persona(String Nombre){
        this.Nombre = Nombre;
    }
}