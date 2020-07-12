/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo3;

/**
 *
 * @author user
 */
public class Estudiante {

    private String universidad;
    private String nombre;
    private double n_de_cuenta;
    private String carrera;
    private String asignatura;   

    public String getUniversidad(){
     return universidad;   
    }
    public String getNombre(){
        return nombre;
    }
    public double getNumeroDeCuenta(){
        return n_de_cuenta;
    }
    public String getCarrera(){
        return carrera;
    }
    public String getAsignatura(){
        return asignatura;
    }


    public void setUniversidad(String universidad){
        this.universidad = universidad;
    } 
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setNumeroDeCuenta(double cuenta){
        this.n_de_cuenta = cuenta;
    }
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }
    public void setAsignatura(String asignatura){
        this.asignatura = asignatura;
    }
   }
  
