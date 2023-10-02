/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici9;

import java.util.Scanner;

/**
 *
 * @author jafe2204
 */
public class Exercici9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la edad: ");
        edad = sc.nextInt();
        
        
        if (edad >= 18)//No va mai amb punt i coma
        {
            System.out.println("Eres mayor de edad");
        } 
        else //edad < 18
        {
            System.out.println("Eres menor de edad");
        }
    }
    
}
