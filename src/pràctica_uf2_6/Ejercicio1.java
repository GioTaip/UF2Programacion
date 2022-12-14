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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Numero: ");
        int Nmiembro=scan.nextInt();
        System.out.println(QuienEsIntegranteDeEsteGrupo( Nmiembro));
        
    }
    public static String QuienEsIntegranteDeEsteGrupo(int Nmiembro){
       String[] miembros={"Marta","Juan"};
       if(Nmiembro-1 >= 0 && Nmiembro-1 < miembros.length){
           return miembros[Nmiembro-1];
       }
       return "";
    }
    
}
