/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte1;

import helpers.Ciudadano;


/**
 *
 * @author user
 */
public class Parte1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ciudadano ci=new Ciudadano("Axsel Maldonado");
        
        ci.Imprimirnombre();
        ci.establecerEdad(20);
        ci.establecerExperiencia(2.5);
        
        System.out.println("Edad "+ci.obtenerEdad());
        System.out.println("Años de experiencia "+ci.obtenerAñosExperiencia());
        
    }
    
    
}
