/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main6;

/**
 *
 * @author zeyne
 */
public class book {
   public String name,author,publisher;
   private int page;
   
   book(String name,String author,String publisher,int page)
   {
       this.name=name;
       this.author=author;
       this.publisher=publisher;
       if(page<1)
       {
           this.page=10;
       }
       else
       {
           this.page=page;
           
       }
   }
   
   public int getpage()
   {
       return this.page;
   }
           
   public void changePage(int size )
   {
       this.page=size;
   }
    
}
