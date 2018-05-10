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
public class EjercicioFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        double estaturas;
        double suma = 0;
        boolean salir = true;
        double prom ;
        int cont = 1;
        String cadena_final;
        
        cadena_final = String.format("%s\n", "estaturas");
        while (salir) {
            System.out.printf("Ingrese la estaturas %d\n", cont);
            estaturas = entrada.nextDouble();
            if (estaturas < 1.20) {
                estaturas = 1.20;
            }
            suma = suma + estaturas;
            
            cadena_final = String.format("%s%.2f\n", cadena_final, estaturas);
            cont = cont + 1;
            entrada.nextLine();
            
            System.out.println("Ingrese si(salir)");
            String temporal = entrada.nextLine();
            if ("si".equals(temporal)) {
                salir = false;
            }
            
        }
        prom = suma / (cont - 1);
        System.out.println("Reporte de Estaturas:");
        System.out.println("Estaturas Estudiante");
        System.out.printf("%s", cadena_final);
        System.out.printf("Promedio de estaturas:%.2f\n",prom);
    }
}
