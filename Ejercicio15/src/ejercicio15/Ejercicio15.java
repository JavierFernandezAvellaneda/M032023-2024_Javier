/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author jafe2204
 */
//15. Determinar cuál de tres números es el mayor
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int num1, num2, num3;
        
        System.out.println("Ingrese el primer numero: ");
        num1= sc.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        num2= sc.nextInt();
        
        System.out.println("Ingrese el tercer numero: ");
        num3= sc.nextInt();
        
        if (num1>=num2&&num1>=num3){
            System.out.println("El numero mayor es: "+num1);
        }else if (num2>=num1&&num2>=num3){
            System.out.println("El numero mayor es: "+num2);
        }else if (num3>=num1&&num3>=num2){
            System.out.println("El numero mayor es: "+num3);
        }
    } 
    
}
