package javaapplication3;

import java.util.Scanner;

/**
 * @author jhand
 - La conversión de grados Celcius (C) a Fahrenheit (F) se realiza con la siguiente expresión matemática:
   F = (9/5)*C+32
   La conversión de Fahrenheit (F) a grados Celcius (C) se realiza con la siguiente expresión matemática:
   F = (F-32)5/9
   Generar la solución que permita obtener por parte de usuario el tipo de conversión que desea realizar y posterior presentación del resultado requerido.
        
 *    (usar la instrucción que se crea conveniente)
 */
public class Ejercicio5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner entrada = new Scanner(System.in);
        
        double grados;
        double result;
        int tipo;
        
        System.out.println("Ingrese los grados ");
        grados = entrada.nextDouble();
        
        System.out.println("Elija un numero para el tipo de conversion a realizar:\n"
                + "1. Conversion de Celcius (C) a Fahrenheit (F)\n"
                + "2. Conversion de Fahrenheit (F) a grados Celcius (C)");
        tipo = entrada.nextInt();
        if(tipo == 1){
            result = 9/5*grados+32; 
            System.out.printf("%.2f grados Celcius son igual a %.2f grados Fahrenheit", grados, result);
        }else{
            if(tipo ==2){
                result = (grados-32)*5/9 ;
                System.out.printf("%.2f grados Faherenheit son igual a %.2f grados Celcius", grados, result);
            }
        }
        
        
    
    } 
   
}