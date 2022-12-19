/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pràctica_uf2_6;

/**
 *
 * @author TINTERITOS
 */
import java.util.Random;

public class Exercici4 {
    /*Escribe un procedimiento llamado “Dau” que escriba por pantalla un entero
      al azar y que esté entre 1 y 6.*/
    public static void main(String[] args) {
        //Llamo al procedimiento
        Dau();
    }

    //Procedimiento para enseñar por pantalla un numero aleatorio entre 1-6
    public static void Dau() {

        //Defino la variable donde se guardara el numero random
        int numero;

        //Creo un nuevo Random
        Random rnd = new Random();

        //Añado un numero aleatorio  entre 1 i 6 a la variable 
        numero = rnd.nextInt(6) + 1;

        //Imprimo la variable con el numero
        System.out.println("Tu numero random es: " + numero);

    }
}
