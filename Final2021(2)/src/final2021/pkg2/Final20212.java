/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package final2021.pkg2;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author zeyne
 */
public class Final20212 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Book b1=new Book("book1",15.6d);
        Book b2=new Book("book2",12.4d);
        Book b3=new Book("book3",10.7d);
        Book b4=new Book("book4",9.5d);
        
        List<Book> Books =new LinkedList();
        Books.add(b1);
        Books.add(b2);
        Books.add(b3);
        Books.add(b4);
        
        Collections.sort(Books);
        Iterator iter=Books.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());
                
        // TODO code application logic here
    }
    
}
