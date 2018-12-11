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
        Persona[] Todos = new Persona[10];
        Todos[0] = new Alumno();
        Todos[1] = new Alumno();
        Todos[2] = new Alumno();
        Todos[3] = new Alumno();
        Todos[4] = new Alumno();
        Todos[5] = new Empleado();
        Todos[6] = new Empleado();
        Todos[7] = new Empleado();
        Todos[8] = new Empleado();
        Todos[9] = new Empleado();
        for (int i = 0; i < Todos.length; i++) {
            //Si es alumno llenarlo con Juan Perez y 001
            //Si es empleado llenarlo con Pedro Paramo y 1000
            if(Todos[i] instanceof Alumno){
            Alumno Obj =(Alumno)Todos[i];
            Obj.Nombre="Juan";
            Obj.Apellido="Perez"; 
        }
        
    }
    
}
class Empleado extends Persona{
    int ClaveEmpleado;
}
class Alumno extends Persona{
    String NoControl;
}
class Persona{
    String Nombre;
    String Apellido;
}
