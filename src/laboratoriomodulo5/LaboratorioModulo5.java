/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriomodulo5;

import helpers.Circulo;
import helpers.Cuadrado;
import helpers.Linea;
import helpers.Triangulo;

/**
 *
 * @author user
 */
public class LaboratorioModulo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo circulo= new Circulo();
        Linea linea= new Linea();
        Triangulo triangulo= new Triangulo();
        Cuadrado cuadrado= new Cuadrado();
        
        circulo.ImprimirInformacion();
        circulo.CalcularRadio(15);
        linea.ImprimirInformacion();
        linea.Largo(5);
        triangulo.ImprimirInformacion();
        triangulo.CalcularArea(10,5);
        cuadrado.ImprimirInformacion();
        cuadrado.CalcularArea(5);
        
        
    }
    
}
