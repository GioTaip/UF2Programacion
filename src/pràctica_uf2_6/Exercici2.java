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

public class Exercici2 {

    /*Escriu un procediment anomenat “PrintReverseString” al que se li passa un
      string i el torna del revés.*/
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //Llamo al procedimiento
        PrintReverseString("");

    }

    //Procedimiento para imprimir una frase al reves
    static void PrintReverseString(String frase) {

        //Pido la frase que queremos devolver
        System.out.print("Escribe una frase para imprimirla al reves: ");
        frase = scan.nextLine();

        //Imprimo la frase al reves
        System.out.print("La frase  al reves seria:  " + new StringBuilder(frase).reverse().toString());
    }
}
