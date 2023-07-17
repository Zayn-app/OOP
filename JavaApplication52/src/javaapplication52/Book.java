/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication52;

/**
 *
 * @author zeyne
 */
public class Book implements Comparable<Book> {
    String name;
    double price;

   
    public Book(String name,double price)
    {
        this.name=name;
        this.price=price;
    }
    double totalPrice()
    {
        return price+(0.08*price);
    }

    @Override
    public int compareTo(Book b) {
        return (int)(this.totalPrice()-b.totalPrice());
    }
    
    @Override
    public String toString()
    {
        return "name: "+name+"price"+price;
    }
}
