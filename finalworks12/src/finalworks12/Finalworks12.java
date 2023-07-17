/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalworks12;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author zeyne
 */
public class Finalworks12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<BankAccount> myAccounts=new ArrayList<>();
        myAccounts.add(new BankAccount(101,"yade",3000));
        myAccounts.add(new BankAccount(102,"ali",4000));
        myAccounts.add(new BankAccount(103,"zeynep",5000));
        myAccounts.add(new BankAccount(105,"ege",6000));
        
        Collections.sort(myAccounts);
        for(BankAccount a:myAccounts)
        {
            a.balanceChange(5000);
            System.out.println(a);
        }
        
        
        
    }
    
}
