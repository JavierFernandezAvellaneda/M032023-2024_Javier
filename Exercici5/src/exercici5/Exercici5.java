/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici5;

import java.util.Scanner;

/**
 *
 * @author jafe2204
 */
public class Exercici5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double radio, diametro, longitud;
        double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pon el radio de circumferencia...");
        radio = sc.nextDouble();
        diametro = radio * 2;
        longitud = pi * diametro;
        System.out.println("La longitud de circumferencia de radio " + radio + " es " + longitud);
        
       
    }
    
}
