/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author jafe2204
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lado,area;
        Scanner sc= new Scanner(System.in);
        System.out.println("Cuanto mide el lado del cuadrado");
        lado = sc.nextInt();
        area = lado * lado;
        
        System.out.println("El area de un cuadrado de lado " + lado + ""
                + "es ..." + area);

    }
    
}
