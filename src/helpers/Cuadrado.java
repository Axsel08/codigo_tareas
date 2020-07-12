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
public class Cuadrado extends Formas{
 public Cuadrado(){
        EstablecerDibujo("Cuadrado");
        EstablecerColor("Azul"); 
        
 }
 public static double CalcularArea(double lado){
    double area;
     area=lado*lado;
    System.out.println("Area: "+ area);
    return area;   
    }
 }
