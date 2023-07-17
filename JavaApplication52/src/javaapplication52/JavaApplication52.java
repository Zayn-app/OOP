/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication52;


import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

/**
 *
 * @author zeyne
 */
public class JavaApplication52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Book b1=new Book("book1",15.6d);
        Book b2=new Book("book2",1.6d);
        Book b3=new Book("book3",5.2d);
        Book b4=new Book("book4",7.3d);
        
        List<Book>Books=new LinkedList();
        Books.add(b1);
        Books.add(b2);
        Books.add(b3);
        Books.add(b4);
        
        Collections.sort(Books);
        
        Iterator iter=Books.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());
            
        
        
    }
    
}
