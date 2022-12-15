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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // Pedimos por teclado la frase
        System.out.print("Introduce la frase: ");
        String frase = scan.nextLine();
        // Mostramos por pantalla las SIGLAS de la frase introducida haciendo una llamada a nuestra función
        System.out.println(Iniciales(frase));
    }
    // Creamos nuestra función llamada "Iniciales" definida con un String recibiendo otro String
    public static String Iniciales(String frase){
        /* Creamos las varibles a ulizar, la primera sera con un array y la segunda sera donde almacenaremos nuestras SIGLAS.
        Para detectar el numero de palabras que hay en la frase utilizaremos un split 
        y utilizaremos los espacios para indicar el inicio de una  nueva palabra*/
        String[] palabras = frase.split(" ");                                               
        String iniciales = "";
        /* Creamos un bucle para recorrer la frase y utilizando el "substring" indicaremos que parte de la pabra nos coja 
        por ultimo lo convertimos en mayusculas*/
        for(int i = 0; i < palabras.length; i++){
            iniciales += palabras[i].substring(0,1).toUpperCase();
        }
        return iniciales;
    }
    
}
