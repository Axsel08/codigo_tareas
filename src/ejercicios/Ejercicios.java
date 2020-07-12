/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner (System.in);
        
        int numero1, numero2,suma,resta,multiplicacion,division;
        
        double mod;
        
        
        
        
        System.out.println("Ingrese numero 1:");
        numero1=teclado.nextInt();
        System.out.println("Ingrese numero 2:");
        numero2=teclado.nextInt();
        
        suma= numero1+numero2;
        System.out.println("suma:"+ suma);
        resta= numero1-numero2;
        System.out.println("resta:"+ resta);
        multiplicacion=numero1*numero2;
        System.out.println("multiplicacion:"+multiplicacion);
        division=numero1/numero2;
        System.out.println("division:"+ division);
        
        mod= numero1%numero2;
        System.out.println("mod;"+mod);
       
        
        
        
    }
    
}
