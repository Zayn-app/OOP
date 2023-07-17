/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author zeyne
 */
public class Account{

    /**
     * @param args the command line arguments
     */private String name;
     private double balance;
     private int password;
     Scanner scan=new Scanner();
      public Account(String name ,double balance,int password)
      {
          this.name=name;
          this.password=password;
          
          if (balance>0.0)
              this.balance=balance;
      }
      
   public void add(double amount){
       balance += amount;
   }   
      
   public void withdraw(double amount){
      
       System.out.println("please enter the 4-digit pass");
       
       
       
      balance -= amount;
      
      
   }
   
   public double getBalance(){
       return balance;
   }
    
   public void setOwnerName(String name){
       this.name = name;
   }
   
  public String getOwnerName(){
    return name;
}
}
