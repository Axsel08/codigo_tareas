/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo1;

/**
 *
 * @author user
 */
public class Arreglo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        int arreglo[][];
        String nombre[] =new String[10];
        
        
        nombre[0] = "Edras Ramos";
        nombre[1] = "Carlos cruz";
        nombre[2] = "Carlos erazo";
        nombre[3] = "Karen Mendoza";
        nombre[4] = "Bessy Medina";
        nombre[5] = "Milton Canales";
        nombre[6] = "Wendy Hernandez";
        nombre[7] = "Jenifer Lopez";
        nombre[8] = "Josue Meraz";
        nombre[9] = "Dimas Guzman";
        
        for (int i = 0; i < 10; i++) {
            int contador=+i;
            System.out.println( contador + "-." + nombre[i] ); 
            
        }
        
    }
    
}
