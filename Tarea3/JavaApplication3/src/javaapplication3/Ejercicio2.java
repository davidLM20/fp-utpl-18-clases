package javaapplication3;

import java.util.Scanner;

/**
 * @author jhand
 *  Una empresa dedicada a vender teléfonos celulares, en base a las siguientes consideraciones:
	- Si el cliente es de tipo 1 se le descuenta 10%
	- Si el cliente es de tipo 2 se le descuenta 20%
	- Si el cliente es de tipo 3 se le descuenta 30%
        La solución debe imprimir el siguiente reporte:
	Nombre: Luis Alvarez
	Tipo de Cliente: 1
	Cantidad de Celulares: 20
	Precio por cada celular: 300
	Subtotal a pagar: cantidad de celulares * precio c/celular
	Descuento: (se debe obtener el descuento)
	Valor final a pagar: Subtotal - Descuento.
Importante, en base al reporte requerido usted debe analizar el conjunto de datos de entrada necesarios.
	(usar la instrucción que se crea conveniente)
 */
public class Ejercicio2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int tipo;
        String nombre;
        int cc;
        int ppc;
        int subtotal;
        double desc;
        double total;
        ppc = 300;
        desc = 0 ;
        /* ppc = precio por celular
           cc = cada celular 
           desc = descuento
        */ 
        
        
        // ingresar el nombre del cliente\     
        System.out.println("Ingrese su nombre y apellido");
        nombre = entrada.nextLine();
        
        //ingres la cantidad de celulares
        System.out.println("Ingrese la cantidad de celulares");
        cc = entrada.nextInt();
       
        // ingresar el tipo de cliente
        System.out.println("Ingrese el tipo de cliente");
        tipo = entrada.nextInt();
        
        subtotal = cc * ppc;
        
        switch (tipo){
            case 1:
                desc = subtotal*0.1;
                total = subtotal-desc;
                break;
            case 2:
                desc = subtotal*0.2;
                total = subtotal-desc;
                break;
            case 3:
                desc = subtotal*03;
                total = subtotal-desc;
                break;
            default:
                total= subtotal;
        }
        System.out.printf("Nombre: %s\n Tipo de cliente: %d\n Cantidad de celulares: %d\n Precio por cada celular %d\n "
                + "SubTotal a Pagar: %d\n Descuento: %.2f\n Valor final a Pagar: %.2f\n", nombre,tipo, cc, ppc, subtotal, desc, total);
  
        }
}