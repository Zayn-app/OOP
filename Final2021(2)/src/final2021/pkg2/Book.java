/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final2021.pkg2;

/**
 *
 * @author zeyne
 */
public class Book implements Comparable<Book>{
    String name;
    double price;

   
    public Book(String name,double price)
    {
        this.name=name;
        this.price=price;
    }
    
    double totalPrice()
    {
        return price+(0.008*price);
    }
    @Override
    public int compareTo(Book b)
    {
        return (int)(this.totalPrice()-b.totalPrice());
    }
    @Override 
    public String toString()
    {
        return "Name: "+name+",Price: "+price;
    }
    
}
