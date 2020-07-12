/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte2;

import helpers.CostaRica;
import helpers.ElSalvador;
import helpers.Honduras;

/**
 *
 * @author user
 */
public class Parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Honduras hn= new Honduras();
        CostaRica cr= new CostaRica();
        ElSalvador es= new ElSalvador();
        
        
        System.out.println(hn.getPais()+ ": "+ hn.getPresidente()); 
        System.out.println(cr.getPais()+ ": "+ cr.getPresidente());
        System.out.println(es.getPais()+ ": "+ es.getPresidente());
        
    }
    
    
}
