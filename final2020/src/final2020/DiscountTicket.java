/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final2020;

/**
 *
 * @author zeyne
 */
public class DiscountTicket extends StandardTicket{
    double discount;
    
    public DiscountTicket(int seatNumber,int number,double discount)
    {
        super(seatNumber,number);
        this.discount=discount;
        
        @Override
        public void print()
        {
            System.out.println(seatNumber+" "+price+""+number+""+ discount);
        }
        
        @Override
        
        public double computerPrice()
        {
            return super.computerPrice()-price*discount;
        }
        
    }
    
}
