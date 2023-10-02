/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici.pkg11;

import java.util.Scanner;

/**
 *
 * @author jafe2204
 */
//11. Muestra el número mayor de dos números y si son iguales que lo diga
public class Exercici11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
         num1 = sc.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextDouble();
        //System.out.println(num1);
        //System.out.println(num2);
        
        if (num1 == num2){
            System.out.println("Ambos numeros son iguales");
        }
        else if (num1 > num2)/*False*/{
            //System.out.println("Numero1 es mas grande que 2");
            System.out.println(num1 + " es mayor a " + num2);
        } 
        else  //num2>1
        {
            System.out.println(num2 + " es mayor a " + num1);    
        }
    }
    
}
