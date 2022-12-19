/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pràctica_uf2_6;

/**
 *
 * @author TINTERITOS
 */
import java.util.Scanner;

public class Exercici5 {

    /*Escribe una función “MCD_Euclides” que devuelva el máximo común divisor de dos
      números según el algoritmo de Euclides.*/
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //Inicializo variables donde se guardaran los numeros
        int numero1, numero2;
        numero1 = LlegirNumeroEnter("Introduce el primer numero entero: ");
        numero2 = LlegirNumeroEnter("Introduce el segundo numero entero: ");
        //Enseñamos el resultado de la función MCD_Euclides
        int mcd = MCD_Euclides(numero1, numero2);
        System.out.println("El MCD de " + numero1 + " y " + numero2 + " es: " + mcd);

    }

    // Funcion para validar si es un numero entero
    static int LlegirNumeroEnter(String mensaje) {
        boolean entradaIncorrecta = true;
        int num = 0;

        while (entradaIncorrecta) {
            System.out.print(mensaje);
            if (scan.hasNextInt()) {

                num = scan.nextInt();

                entradaIncorrecta = false;
            } else {
                System.out.println("Tiene que ser un numero entero, vuelve a intentarlo");
                scan.next();
            }
        }
        return num;
    }

    //Funcion  MCD_Euclides que devuelve el maximo comun divisor de 2 numeors
    static int MCD_Euclides(int a, int b) {
        //Defino la variable donde se guardara el resultado
        int resultado;
        if (b == 0) {
            resultado = a;
        } else if (a == 0) {
            resultado = b;
        } //Si no se cumple nada de lo anterior devuelve el maximo divisor
        else {
            resultado = MCD_Euclides(b, a % b);
        }
        return resultado;
    }
}
