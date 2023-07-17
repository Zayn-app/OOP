/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final2020;

/**
 *
 * @author zeyne
 */
public class StandardTicket extends Ticket {
    
    double price;
    public StandardTicket(int seatNumber,int number)
    {
        super(seatNumber,number);
        this.price=10;
    }
    

    
    
    @Override
    void print() {
      System.out.println(seatNumber+" "+price+""+number);
    }

    @Override
    double computerPrice() {
        return price;
    }
    
    
}
