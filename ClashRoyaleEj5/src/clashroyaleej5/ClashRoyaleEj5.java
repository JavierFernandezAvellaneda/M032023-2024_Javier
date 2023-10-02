/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyaleej5;

import java.util.Scanner;

/**
 *
 * @author jafe2204
 */
public class ClashRoyaleEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantes copes tens?");
        int copes = scanner.nextInt();
        
        
        if (copes < 2000)    // Si el número de copas es menor a 2000 
        {
            System.out.println("Quina carta vols Mago Electrico(0) o esbirro mega(1)?");
            int carta = scanner.nextInt();

            if (carta == 0)// Seleccion de la carta Mago Electrico 
            {
                System.out.println("Has escollit Mago Electrico");
            } 
            else if (carta == 1) // Seleccion de la carta esbirro mega
            {
                System.out.println("Has escollit esbirro mega");
            } 
            else // Entrada no válida
            {
                System.out.println("Entrada no valida");
            }
        } 
        else if (copes < 3000) // Si el número de copas es igual o menor a 3000 
        {
            System.out.println("Quina carta vols Cavallero(0) o Bandida(1)?");
            int carta = scanner.nextInt();

            if (carta == 0) // Seleccion de la carta Cavallero
            {
                System.out.println("Has escollit Cavallero");
            } 
            else if (carta == 1) // Seleccion de la carta Bandida
            {
                System.out.println("Has escollit Bandida");
            } 
            else // Entrada no válida
            {
                System.out.println("Entrada no valida");
            }
        }
        else // Si el número de copas es igual o mayor a 3000 
        {
            System.out.println("¿Qué carta quieres Ejercito de esqueletos(0) o Gigante(1)?");
            int carta = scanner.nextInt();

            if (carta == 0) // Seleccion de la carta Ejercito esqueletos
            {
                System.out.println("Has escollit Ejercito esqueletos");
            } 
            else if (carta == 1) // Seleccion de la carta Gigante
            {
                System.out.println("Has escollit Gigante");
            } 
            else // Entrada no válida
            {
                System.out.println("Entrada no valida");
            }
        }
    }
    }

