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
        System.out.print("Introduce la frase: ");
        String frase = scan.nextLine();
        System.out.println(Iniciales(frase));
    }
    public static String Iniciales(String frase){
        String[] palabras = frase.split(" ");
        String iniciales = "";
        for(int i = 0; i < palabras.length; i++){
            iniciales += palabras[i].substring(0,1).toUpperCase();
        }
        return iniciales;
    }
    
}
