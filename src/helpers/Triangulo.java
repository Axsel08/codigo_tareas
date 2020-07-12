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
public class Triangulo extends Formas{
    
    public Triangulo(){
        EstablecerDibujo("Triangulo");
        EstablecerColor("Cafe");
        
    }
    public static double CalcularArea(double base,double altura){
    double area;
    
        area=base*altura;
        System.out.println("Area: "+ area);   
     return area;
     
    }
    
}
