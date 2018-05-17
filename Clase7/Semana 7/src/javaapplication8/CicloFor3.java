/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author jhand
 */
public class CicloFor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //El encabezado de la instruccion for incluye la inicializacion
        //la condicion de continuacion de ciclo y el incremento
        int suma=0;
        for (int contador=1; contador<=20; contador++){    
            if (contador%2==0){
                suma=suma+contador;
            }
        }
        
        System.out.printf("La suma de los numeros pares del 1 al 20 es: %d ",suma);
        System.out.println();//Ingrese una nueva linea
    }// fin de la clase
    
}
