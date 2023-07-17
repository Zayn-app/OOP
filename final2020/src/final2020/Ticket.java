/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final2020;

/**
 *
 * @author zeyne
 */
public  abstract class Ticket {
    
    public int number;
    int seatNumber;
    
    public Ticket(int number,int seatNumber)
    {
        this.number=number;
        this.seatNumber=seatNumber;
    }
    
     abstract void print();
    abstract double computerPrice();
}
