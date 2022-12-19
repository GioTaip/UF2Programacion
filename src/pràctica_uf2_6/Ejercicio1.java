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
public class Ejercicio1 {
    /*Escribe una función llamada “QuienEsIntegranteDeEsteGrupo” que, reciba como
      parámetro un número entero i-ésimo, y devuelva el miembro i-ésimo del grupo. Si no hay
      miembro i-ésim tiene que devolver una cadena vacía*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        // Solicitamos el numero por teclado
        System.out.print("Numero: ");
        int Nmiembro=scan.nextInt();
        // Mostramos por pantalla el nombre de la lista haciendo una llamada a nuestra función
        System.out.println(QuienEsIntegranteDeEsteGrupo( Nmiembro));
        
    } /* Creamos nuestra función, recibira un entero y nos devolvera un String*/
    public static String QuienEsIntegranteDeEsteGrupo(int Nmiembro){
       // Creamos una variable String con un Array con nuestra lista definida
       String[] miembros={"Geovanny","Jonathan"}; 
       /* Condicionamos la entrada para indicar si el entero que entra esta dentro del array y devolvemos el nombre
          ya que el numero que entra es el orden de la lista enumerada*/
       if(Nmiembro-1 >= 0 && Nmiembro-1 < miembros.length){
           return miembros[Nmiembro-1];
       }
       // En caso de que no se cumpla la condición y el numero que entre este fuera del array nos devolvera una cadena vacia
       return "";
    }
    
}
