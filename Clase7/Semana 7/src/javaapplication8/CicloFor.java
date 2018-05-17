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
public class CicloFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //El encabezado de la instruccion for incluye la inicializacion
        //la condicion de continuacion de ciclo y el incremento
        for(int contador = 1; contador <= 10; contador++){
             System.out.printf("%d ",contador);
        }
        System.out.println();//Ingrese una nueva linea
    }// fin de la clase
    
}
