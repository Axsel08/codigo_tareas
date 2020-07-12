/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancia_tarea3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Recursos {
    public String mensaje;
    public int nota;
    public int division;
    public int lista;
    int numero1;
    int numero2;
    
    
    
    
    
    public String mensaje(){
        String mensaje= "Estoy aprendiendo pero sere el mejor programador del mundo";
        System.out.println(mensaje);{
       
        return mensaje;
    }
        
    }
    public int nota(){
    int nota= 85;
        if (nota>=70 ) {
            System.out.println("Promedio *******************************");
            System.out.println(nota + " Aprobado");
            
        } else {
            System.out.println("Reprobado");
        }
        
        return nota;
        
    }
    
    public int division(){
    Scanner teclado =new Scanner(System.in);    
    int resultado;
        System.out.println("Division****************************");   
    do {System.out.println("ingrese numero 1");
        numero1=teclado.nextInt();
        System.out.println("ingrese numero 2");
        numero2=teclado.nextInt();
        resultado= numero1/numero2;
        System.out.println("resultado: "+resultado);
            
        } while (numero2==0);
        
        return resultado;
        
        
    }
    public int lista(){
    Scanner teclado =new Scanner(System.in);
    int numerox;
        System.out.println("Lista********************************");
        System.out.println("ingrese numero x");
        numerox=teclado.nextInt();
        for (int lista = 0; lista < numerox; lista++) {
            
            
            System.out.println(lista);
        }
        return lista;
    
        
    }
    
       
    
}
