/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package corrección;

import java.util.Scanner;

/**
 *
 * @author jafe2204
 */
public class Corrección {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int copes, eleccio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas copas has conseguido");
        if (copes<2000)
        {
            System.out.println("Escoge entre mago(0) i esbirro mega(1)");
            eleccio = sc.nextInt();
            if (eleccio==1){
                System.out.println("Escogido Megaesbirro");
            }else if (eleccio==0){
                System.out.println("Escogido Mago");
            }else {
                System.out.println("Opcion no valida");
            }
        }
        else if (copes>=2000&&copes<3000)
        {
                System.out.println("Escoge entre Cavallero(0) i Bandida(1)");
            eleccio = sc.nextInt();
            if (eleccio==1){
                System.out.println("Escogido Bandida");
            }else if (eleccio==0){
                System.out.println("Escogido Cavallero");
            }else {
                System.out.println("Opcion no valida");
            }
        }
        else if (copes >= 3000){
             System.out.println("Escoge entre esqueletos(0) i gigante(1)");
            eleccio = sc.nextInt();
            if (eleccio==1){
                System.out.println("Escogido gigante");
            }else if (eleccio==0){
                System.out.println("Escogido esqueleto");
            }else {
                System.out.println("Opcion no valida");
            }
        }
    }
    
}
