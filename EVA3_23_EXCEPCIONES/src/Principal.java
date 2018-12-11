
import java.util.logging.Level;
import java.util.logging.Logger;

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
        Empleado Emp = new Empleado();
        Emp.setNombre("Daniel");
        Emp.setApellido("Yañez");
        try {
            Emp.setSalario(-1000.0);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
class Empleado{
    private String Nombre;
    private String Apellido;
    private double Salario;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) throws Exception {
        if(Salario<0)//Salarios negativos
            throw new Exception("No se permiten salarios negativos");
        this.Salario = Salario;
    }
}
