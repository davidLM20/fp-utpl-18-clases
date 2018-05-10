/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author jhand
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada=new Scanner(System.in);
        int edad;
        int contador=1;
        int suma=0;
        String cadena_final;
        
        cadena_final = String.format("%s\t%s\n","Edad","Suma");
        while(contador <=5){
            System.out.println("Ingrese la edad");
            edad = entrada.nextInt();
            suma=suma+edad;
            cadena_final=String.format("%s%d\t%d\n",cadena_final,edad,suma);
            contador= contador +1;            
            
        }

        System.out.printf("%s",cadena_final);
    }
    
}
