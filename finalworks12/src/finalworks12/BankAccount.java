/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalworks12;

/**
 *
 * @author zeyne
 */
public class BankAccount implements Comparable <BankAccount>{
    int accountNo;
    String holderName;
    double balance;
    
    public BankAccount(int accountNo,String holderName,double balance)
    {
        this.accountNo=accountNo;
        this.balance=balance;
        this.holderName=holderName;
    }
    
    void balanceChange(double amount)
    {
        this.balance=amount;
    }

    @Override
    public int compareTo(BankAccount t) {
        
        return this.holderName.compareTo(t.holderName);
    }
    
    @Override
  public String toString()
  {
      return "Account: "+accountNo+","+holderName+","+balance;
  
  }
    
    
    

    
}
