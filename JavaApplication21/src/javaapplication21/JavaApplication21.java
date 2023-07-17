/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication21;

/**
 *
 * @author zeyne
 */

import java.util.Scanner;
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner =new Scanner (System.in);
        try   
        {
            System.out.println("enter a value");
            int num1=scanner.nextInt();
            System.out.println("enter your second number");
            int num2=scanner.nextInt();
            
            System.out.println(num1/num2);
        }
        catch(Exception e)
        {
            System.out.println("you cannot divide by zero");
        }
    }
    
}
