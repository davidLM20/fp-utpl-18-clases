package javaapplication3;

import java.util.Scanner;

/**
 * @author jhand
 *   Solución que permita calcular y presentar los valores de X y Y, teniendo como dato 
     de entrada el valor de X y obtener el de Y en base a las siguientes restricciones:
    Si X<0 entonces Y=3*X+10
    Si X>0 entonces Y=X**2+6
    Si X==0 entonces Y=1
 * 
    (usar la instrucción que se crea conveniente)
 */
public class Ejercicio3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int x;
        int y;
             
        // Se pide un valor para la variable x 
        System.out.println("Ingrese un valor para la variable x");
        x = entrada.nextInt();
        // se da las condiciones para evaluar el valor de x & dar valor a y
        if (x<0){
           y = 3*x+10;
           System.out.printf("El valor de X es: %d y el valor de Y es: %d" , x, y) ;
        }else{
            if (x>0){
               y = x*2+6;
               System.out.printf("El valor de X es: %d y el valor de Y es: %d" , x, y) ;
            }else{
                if (x==0){
                y = 1;
                System.out.printf("El valor de X es: %d y el valor de Y es: %d" , x, y) ;   
               
                
                
                }
            }
        }            
    }
}