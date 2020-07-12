/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author user
 */
public class Linea extends Formas {
    
    public Linea(){
        EstablecerDibujo("Linea");
        EstablecerColor("Amarilla");
        
    }
    public static int Largo(int largo){
        System.out.println("Largo: "+ largo);
        return largo;
        
    
    }
    
}
