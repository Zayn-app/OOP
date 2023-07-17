/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main6;

/**
 *
 * @author zeyne
 */
public class Main6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        book b1=new book("harry potter","rowling","kodlama vakti",400);
        b1.changePage(500);
        System.out.println(b1.getpage());
    }
    
}
