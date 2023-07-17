/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midd2;

/**
 *
 * @author zeyne
 */
public class NFT {
    private double balance;
    private String owner;
    public NFT(double balance,String owner)
    {
        
        this.balance=setBalance(balance);
        this.owner=owner;
    }
    
    private double setBalance(double balance)
    {
    if(balance<0 || balance>100)
        throw new IllegalArgumentException("error");
    return balance;
    
    }
    
}
