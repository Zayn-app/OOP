/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final2020;

import java.util.List;

/**
 *
 * @author zeyne
 */
public class TicketSeller {
    List<Ticket> tickets;
    private double incomes;
    
    public TicketSeller(List<Ticket>tickets)
    {
        this.tickets=tickets;
    }
    
    public void Sell(Ticket ticket)
    {
        incomes+=ticket.computerPrice();
        tickets.remove(ticket);
    }
    public double getIncomes()
    {
        return incomes;
    }
}
