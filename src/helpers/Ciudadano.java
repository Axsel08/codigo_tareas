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
public class Ciudadano {
    
    private String nombre;
    private int edad;
    private double Experiencia;
    
    public Ciudadano(String nombre){
       this.nombre = nombre;    
    }
    public void establecerEdad(int edad){
     this.edad = edad;   
    }
    public void establecerExperiencia(double Experiencia){
          this.Experiencia = Experiencia;   
    }
    public void Imprimirnombre(){
        System.out.println(nombre);
    }
    public int obtenerEdad(){
        
        return edad;
    }
    public double obtenerAñosExperiencia(){
        return Experiencia;
    }
    
}

