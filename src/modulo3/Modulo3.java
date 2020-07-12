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
public class Modulo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estudiante = new Estudiante();
    estudiante.setUniversidad("UTH");
    estudiante.setNombre("Axsel Maldonado");
    estudiante.setNumeroDeCuenta(2019300);
    estudiante.setCarrera ("Ingeniería industrial");
    estudiante.setAsignatura ("Programacion orientada a objetos");

System.out.println("Universidad " + estudiante.getUniversidad() );
System.out.println("Nombre " + estudiante.getNombre() );
System.out.println("Numero De Cuenta " + estudiante.getNumeroDeCuenta() );
System.out.println("Carrera " + estudiante.getCarrera() );
System.out.println("Asignatura " + estudiante.getAsignatura() );
    }
    
}
