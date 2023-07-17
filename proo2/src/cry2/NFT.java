/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cry2;

/**
 *
 * @author zeyne
 */
public class NFT {
    public double balance;
    public String owner;
    
   public  NFT(double balance,String owner)
    {
    this.balance=setBalance(balance);
    this.owner=owner;
    
    }
    
    private double setBalance(double balance)
    {
        
        if(balance<0 || balance>1000)
        {
            throw new IllegalArgumentException("not found 101");
       return balance;
        
        }
    }
    
    
   
    
}
