/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package correccion2royale;

import java.util.Scanner;

/**
 *
 * @author jafe2204
 */
public class Correccion2Royale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int copes;
        char eleccio;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuantas copas tienes? ");
        if(copes<2000){
            System.out.println("Entre mago (m) y mega esbirro(e)");
    }else if (copes>=2000 && copes<3000){
            System.out.println("Entre bandido (b) y cavallero (c)");
    }else if (copes>3000){
            System.out.println("Entre esqueletos(s) y gigante (g)");
    }
        System.out.println("Opcio? ");
        eleccio = sc.next().charAt(0);
        System.out.println("Eleccio<-- "+ eleccio);
        if (eleccio='s'||eleccio='S'){
            System.out.println("Has escogido esqueletos");
        }else  (eleccio='g'||eleccio='G'){
        System.out.println("Has escgido gigante");
    }
    
}

