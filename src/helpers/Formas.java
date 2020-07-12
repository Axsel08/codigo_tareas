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
public class Formas {
    private String color;
    private String dibujar;
    
    public Formas(){
        
    }
    public void EstablecerColor(String color){
      this.color=color;  
    }
    public String ObtenerColor(){
        return this.color;
    }
    public void EstablecerDibujo(String dibujo){
        this.dibujar=dibujo;
    }
    public String ObtenerDibujo(){
        return this.dibujar;
    }
    
    public void ImprimirInformacion(){
        System.out.println("Dibujo: "+dibujar);
        System.out.println("Color: "+color);
        
    }
    
    
    
    
    
}
