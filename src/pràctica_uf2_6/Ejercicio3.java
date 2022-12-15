/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pràctica_uf2_6;
import java.util.Scanner;

/**
 *
 * @author giiov
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Solicitamos el tamaño del vector por teclado
        System.out.print("Cuantos numeros deseas introducir: ");
        int cantidad = scan.nextInt();
        int[] numeros = new int[cantidad];
        // Solicitamos los numeros que contendra el vector mediante un bucle los vamos metiendo en nuetra variable "numeros"
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Introduce numero: ");
            numeros[i] = scan.nextInt();
        }
        // Llamamos a nuestra función para que nos muestre por pantalla el numero major que contiene el vector
        System.out.println("El numero mas grande es: "+ Maximo(numeros));
    }
    // Creamos nuestra función llamada "Maximo" que nos devolvera un entero pero entrara un vector
    public static int Maximo(int[] numeros) {
        // Creamos nuestra variable "maximo" que es donde almacenaremos el numeros más grande
        int maximo = 0;
        // Creamos un bucle donde nos recorrera nuestro vector
        for (int i = 0; i < numeros.length; i++) {
            // Ponemos una condción para que nuestra varibale "maximo" se quede con el numero más grande
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        return maximo;
    }

}
