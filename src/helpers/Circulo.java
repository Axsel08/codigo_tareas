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
public class Circulo extends Formas {
    
    public Circulo(){
        EstablecerDibujo("Circulo");
        EstablecerColor("Rojo");
        
    }
    public static double CalcularRadio(int circ){
        double radio,dospi;
        dospi=6.28;
        radio=circ/dospi;
        System.out.println("Radio: "+ radio);
        return radio;
    
        
        
    }
    
}
