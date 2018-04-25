package javaapplication3;

import java.util.Scanner;

/**
 * @author jhand
 *    En una empresa dedicada a la venta de balones
 *    si se compra uno se hace un descuento de 50%
 *    si se compra 2 descuento de 70%
 *    se compra 3 o más se descuenta 80%. 
 *    Generar la solución que permita leer el número de balones a comprar el precio de cada balón y el valor final a cancelar.
 */
public class Ejercicio4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner entrada = new Scanner(System.in);
        int numerobal;
        double desc;
        double valorbalon;
        double total;
        double subtotal;
        
        desc = 0;
        // se pide la cantidad total de balones
        System.out.println("Ingrese la cantidad total de balones a comprar");
        numerobal = entrada.nextInt();
        // se pide el precio unitario de los balones 
        System.out.println("Ingrese el valor unitario del balon");
        valorbalon = entrada.nextDouble();
        
        
        subtotal = numerobal*valorbalon;
        if (numerobal == 1){
            desc = (50* subtotal)/100;
        }else{
            if(numerobal==2){
                desc = (70* subtotal)/100;
            }else{
                if(numerobal >=3){
                    desc = (80* subtotal)/100;
                    
                }
                
            }
        }
        
        total = subtotal-desc ;
        
        System.out.printf("Subtotal: %.2f $\nValor unitario:%.2f $\nTotal a cancelar:%.2f$ ",subtotal,valorbalon, total);
        
        
                
      
           
                
        
    
    } 
   
}