package javaapplication3;

import java.util.Scanner;

/**
 * @author jhand
 * Una solución que permia leer el número de día (un valor entre 1 y 7) e imprima Lunes si es 1, Martes si es 2, ... , Domingo si es 7.
	(usar instrucción switch)
 */
public class EjercicioDias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese un número del 1-7");
        Scanner n = new Scanner(System.in);
        int numero;
        numero = n.nextInt();
        switch (numero){
            case 1:
                System.out.println("El día de la semana es Lunes");
                break;
            case 2:
                System.out.println("El día de la semana es Martes");
                break;
            case 3:
                System.out.println("El día de la semana es Miercoles");
                break;
            case 4:
                System.out.println("El día de la semana es Jueves");
                break;
            case 5: 
                System.out.println("El día de la semana es Viernes");
                break;
            case 6:
                System.out.println("El día de la semana es Sabado");
                break;
            case 7 :
                System.out.println("El día de la semana es Domingo");
                break;  
            default:
                System.out.println("El número ingresado no es correcto");
        }
    }

}
