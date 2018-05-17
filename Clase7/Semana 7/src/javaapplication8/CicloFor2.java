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
public class CicloFor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pares=0;
        int suma=0;
        //El encabezado de la instruccion for incluye la inicializacion
        //la condicion de continuacion de ciclo y el incremento
        for(int contador = 2; contador <= 20; contador+=2){

            suma = suma + contador;    
        }
        
            
             
             
             System.out.printf("%d ",suma);
        System.out.println();//Ingrese una nueva linea
    }// fin de la clase
    
}
