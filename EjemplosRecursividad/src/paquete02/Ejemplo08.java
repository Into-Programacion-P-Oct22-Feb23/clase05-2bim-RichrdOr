/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;
import java.util.Scanner;

public class Ejemplo08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamanio;
        System.out.println("Ingrese el tamaño de el arreglo: ");
        tamanio = entrada.nextInt();
        int []arreglo1 = new int [tamanio];
        
        for ( int i = 0; i < arreglo1.length; i++){
            System.out.println("Ingrese los valores: ");
            arreglo1[i] = entrada.nextInt();
        }
        System.out.printf("El resultado es: %d\n",misterio(arreglo1,tamanio));
        // Ingresar por teclado el tamaño de un arreglo
        // Ingresar por teclado los valores enteros del arreglo
        // Sumar los valores del arreglo, mediante la función misterio
    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}
