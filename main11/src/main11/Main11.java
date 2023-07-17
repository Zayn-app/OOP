/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main11;

/**
 *
 * @author zeyne
 */
import java.util.Scanner;

public class Main11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Account account=new Account("zeynep çeçen",50.00);
        Account account2=new Account("rabia çetin",7.00);
        
        
        System.out.printf("%s balance :$%.2f%n",account.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",account2.getBalance());
        
        Scanner input=new Scanner(System.in);
        System.out.println("enter deposit amount for acc1");
        double depositAmount=input.nextDouble();
        System.out.printf("%d nadding %.2f to acc1 balance %n%n",depositAmount);
        account.deposit(depositAmount);
        
        
        System.out.printf("%s balance: %.2f%n",account.getName(),account.getBalance());
        System.out.printf("%s balance: %.2f%n",account2.getName(),account2.getBalance());
        
        System.out.printf("enter deposit account2: ");
        depositAmount=input.nextDouble();
        System.out.printf("% nadding %.2f to acc2 balance %n%n",depositAmount);
        account2.deposit(depositAmount);
        
        System.out.printf("%s balance : %.2f%n",account.getName(),account.getBalance());
        
        
        // TODO code application logic here
    }
    
}
