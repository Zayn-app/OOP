/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main10;

/**
 *
 * @author zeyne
 */
public class nonstatic {
    private int a =10;
    
    public class Inner{
        int a =1;
        
        public void run()
        {
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(nonstatic.this.a);
        }
        
    }
    
}
