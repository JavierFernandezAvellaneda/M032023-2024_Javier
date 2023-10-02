/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author jafe2204
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
         double num;
         System.out.println("Introduce la nota: ");
         num= sc.nextDouble();
         
         if (num>=0&&num<3){
             System.out.println("Nota academica: "+num+" Muy deficiente");
         }else if (num>=3&&num<5){
             System.out.println("Nota academica: "+num+" Insufieciente");
         }else if (num>=5&&num<6) {
             System.out.println("Nota academica: "+num+" Bien");
         }else if (num>=6&&num<9) {
             System.out.println("Nota academica: "+num+" Notable");
         }else if (num>=9&&num<=10){
             System.out.println("Nota academica: "+num+" Sobresaliente");
         }else if (num<0||num>10){
             System.out.println("El valor introducido " + num + " no es valido");
         }
    }
    
}
