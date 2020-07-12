/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo2;

/**
 *
 * @author user
 */
public class Arreglo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[][];
        String nombre[] =new String[5];
        System.out.println("  Nombre  Apedillo Carrera   Lugar de trabajo");
        nombre[0] = "Edras  Ramos   Electronica  Tigo";
        nombre[1] = "Carlos cruz    Electronica  Bac Credomatic";
        nombre[2] = "Carlos erazo   Industrial   Dinant";
        nombre[3] = "Karen  Mendoza Industrial   Hondutel";
        nombre[4] = "Milton Canales Computacion  Banco Central";
       
        
        for (int i = 0; i < 5; i++) {
            int contador=+i;
       
            System.out.println( contador + "-." + nombre[i] );
    }
        
    
}
