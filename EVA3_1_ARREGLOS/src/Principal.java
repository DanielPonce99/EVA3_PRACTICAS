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
        //Arreglos Es una secuencia contigua de varianles del mismo tipo
        //Capturar muchos datos del mismo tipo
        //Capturar Edad, Imprimir, Calcular media
        //Tec2 --> 3 mil estudiantes (4 bytes) = 12 mil bytes
        //Usamos un arreglo
        //Tipo de datos || nombre el identificador = new tipo
        //Los arreglos son de accesos aleatorios
        //Acceso secuencial: 
        int [] aiEdades = new int[3000];
        // Arreglos en Java, C, C++ tiene direcciones para cada 
        //Posicion --> 0 es la primera --> n-1 la ultima
        //Siendo n ---> tamaño del arreglo
        System.out.println("Primer Posicion =" + aiEdades[0]);
        System.out.println("Primer Posicion =" + aiEdades[2999]);
        //Llenarlo con edades:
        //17 - 40
        for (int i=0; i<aiEdades.length; i++){
            
            int Edad = (int)(Math.random()*(40-16)+17);
            aiEdades[i] = Edad;
        }
        //Imprimir todo el arreglo:
        for (int i = 0; i < aiEdades.length; i++) {
            System.out.println(aiEdades[i]);
        }
        //FOR EACH
        for (int aiEdade : aiEdades) {
            System.out.println("For each -" +aiEdades);
        }
        //Sumatoria para calcular la media
        int iAcum = 0;
        for (int i = 0; i < aiEdades.length; i++) {
            iAcum = iAcum + aiEdades[i];
            
            
        }
        System.out.println("La media es: "+ (double)(iAcum/3000));
    }
   
}
