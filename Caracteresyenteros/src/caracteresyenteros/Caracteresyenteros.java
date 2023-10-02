/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caracteresyenteros;

import java.util.Scanner;

/**
 *Te va a pedir a que clase vas (A/B/C)
 * y te va a pedir una eda
 * a la clase A van los adultos 
 * y a la clase B o la C van los menores de edad
 * el programa tiene que comprobar que estas en la clase correcta
 * 
 * @author jafe2204
 */
public class Caracteresyenteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        int edad;
        char clase; //character = letras
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("A que clase vas? ");
        
        clase = sc.next().charAt(0);
        
        System.out.println("Vas al grupo " +clase);
        
        System.out.println("Que edad tienes? ");
        
        edad=sc.nextInt();
        
        System.out.println("Tienes "+edad+" años");
        
        if (clase=='A' && edad>18){
             System.out.println("Vas a la clase correcte "+clase);
        }else if (clase=='B' && edad < 18){
             System.out.println("Vas a la clase correcte "+clase);
        }else if (clase=='C' && edad < 18){
             System.out.println("Vas a la clase correcte "+clase);
        }else{
            System.out.println("Tus datos introducidos no son correctos");
        } 
        

    }
    
}
