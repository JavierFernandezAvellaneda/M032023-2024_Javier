/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horasextras;

import java.util.Scanner;

/**
 *
 * @author jafe2204
 */
public class Horasextras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int horas,horasextras,salario,salarioextra,tarifanormal,tarifaextra;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas horas has trabajado");
        horas = sc.nextInt();
        if (horas<35){
            System.out.println("Has treballat les hores que necesitaves el teu  sou es");
        }
    }
    
}
